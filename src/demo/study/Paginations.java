package demo.study;


import demo.algorithm.map_.Entry;
import demo.customerdata.Member;
import org.boon.core.Sys;
import org.boon.primitive.Int;
import org.yaml.snakeyaml.events.MappingEndEvent;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

enum Pagenation {
    POST_PER_PAGE(10),
    BLOCK_SIZE(8);

    private final int pageSzie;

    Pagenation(int pageSzie) {
        this.pageSzie = pageSzie;
    }

    public int getPageSzie() {
        return pageSzie;
    }
}

public class Paginations {
    // https://congsong.tistory.com/26
    // https://velog.io/@minsangk/%EC%BB%A4%EC%84%9C-%EA%B8%B0%EB%B0%98-%ED%8E%98%EC%9D%B4%EC%A7%80%EB%84%A4%EC%9D%B4%EC%85%98-Cursor-based-Pagination-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0
    // https://semtax.tistory.com/77
    // https://doublesprogramming.tistory.com/100

    List<Member> memberList = new ArrayList<>();

    private int prevPagge;                                                  // 이전 페이지
    private int nextPagge;                                                  // 다음 페이지
    private boolean hasPrev;                                                // 이전 블럭의 유무
    private boolean hasNext;                                                // 다음 블럭의 유무


    private int currentPage;                                                // 현재 게시물의 페이지 위치
    private int currentBlock;                                               // 현재 게시물의 블록 위치
    private int currentPageNumberInBlock;                                   // 현재 게시물의 블럭에서 페이지 위치
    private int blockEndNumber;                                             // 현재 게시물의 페이지 블럭 끝 번호
    private int lastBlockNum;                                               // 블럭 마지막 번호

    private int pageStartNumber;                                            // 페이지 시작 번호
    private int pageLastNumber;                                             // 페이지 마지막 번호
    private int blockStartNumber;                                           // 현재 페이지 블럭 시작 번호


    private int totalPostCount;                                             // 전체 게시물 개수
    private int totalPageCount;                                             // 전체 페이지 개수
    private int totalBlockCount;                                            // 전체 블럭 개수

    private int postPerPage;                                                // 한 페이지 당 게시물 개수
    private int pagePerBlock;                                               // 한 블럭 당 페이지 개수


//    int blockSize = (int) ((double) totalPageCount / pagePerBlock) + 1;   // 전체 블럭 갯수
//int startBlockNumber = ((currentBlock - 1) * pagePerBlock) - 7;       // 블럭 start number

//    int pagePerBlock = Pagenation.PAGE_SIZE.getPageSzie();                // 한 블럭 당 페이지 개수

//    int startBlockNumber = ((currentBlock - 1) * pagePerBlock) - 7;       // 블럭 start number
//    int endBlockNumber;                                                   // 마지막 페이지일 경우, 아닐 경우
//    int currentPageNumberInBlock = (currentPage - startBlockNumber) + 1;  // 블럭 위치


    // 1.생성자
    Paginations(int pagePerBlock, int postPerPage, int totalPostCount) {
        this.pagePerBlock = pagePerBlock;
        this.postPerPage = postPerPage;
        this.totalPostCount = totalPostCount;
        this.setTotalLastPage();
    }

    // 2.Getter, Setter(1번)
    public int getTotalPostCount() {
        return totalPostCount;
    }

    public void setTotalPostCount(int totalPostCount) {
        this.totalPostCount = totalPostCount;
    }

    public int getPostPerPage() {
        return postPerPage;
    }

    public void setPostPerPage(int postPerPage) {
        this.postPerPage = postPerPage;
    }

    public int getPagePerBlock() {
        return pagePerBlock;
    }

    public void setPagePerBlock(int pagePerBlock) {
        this.pagePerBlock = pagePerBlock;
    }



    // 내 게시물이 몇 번째 게시물인지, 그게 몇 번째 페이지, 블록에 있는지
    public void pageInfo(int currentPost) {

        // 몇 번째 페이지에 있는지
        int currentPage = (int) Math.ceil((currentPost - 1) / Pagenation.POST_PER_PAGE.getPageSzie() + 1);

        // 전체 블럭의 갯수
        int totalBlockCount = (int) (totalPostCount / postPerPage * pagePerBlock);

        // 어느 블록에 있는지
        int currentBlock = (int) totalPostCount / Pagenation.POST_PER_PAGE.getPageSzie();

        // 블록의 시작 번호는 무엇인지
        int blockStartNumber = (currentBlock - 1) * Pagenation.BLOCK_SIZE.getPageSzie();

        // 블록의 끝 번호는 무엇인지
        int blockEndNumber = blockStartNumber * Pagenation.BLOCK_SIZE.getPageSzie() - 1;
    }


    public boolean hasPrev(int totalPostCount) {
        return (pageStartNumber == 1) ? false : true;
    }

    public boolean hasNext(int totalPostCount) {
        return (pageLastNumber > totalPageCount) ? false : true;
    }





        public void test(){


        if (blockEndNumber > totalPageCount) {
            blockEndNumber = totalPostCount;
        }

        prevPagge = (currentPage == 1) ? 1 : (currentBlock - 1) * Pagenation.BLOCK_SIZE.getPageSzie();

        int startBlockNumber = ((currentBlock - 1) * pagePerBlock) - 7;
        currentPageNumberInBlock = (currentPage - startBlockNumber) + 1;
    }




    // 3.마지막 페이지 설정(게시물의 개수에 따른)
    public void setTotalLastPage() {
        if (totalPostCount == 0) {
            this.totalPageCount = 0;
        } else if (totalPageCount > 0) {
            totalBlockCount = (int) (Math.ceil((double) totalPostCount / postPerPage));
        }
    }


    // 4.
    private Map<String, Object> getBlock(Integer currentPageNum, Boolean isFixed) {
        Integer blockStartNumber = ((currentBlock - 1) * pagePerBlock) - 7;

        if (totalPostCount != 0 && currentPageNum > totalPageCount) {
            throw new IllegalStateException("전체게시물보다 많음");
        }

        return map;

    }


    List<Person> list = new ArrayList<>();

    Map<String, Object> map = new HashMap<>();

    //https://devkingdom.tistory.com/110


    // id 중복체크
    public int test(String id) {
        Person p = new Person("a", 1);
        Optional<Person> person = Optional.ofNullable(new Person("a", 1));
        Optional<String> checkId = Optional.ofNullable(id);
        if (Optional.ofNullable(id).isPresent()) {
            map.get(person.get().getName()).equals("a");
            map.get(checkId.get());
            return list.stream().anyMatch(Person -> Person.getName().equals(checkId.get())) ? 1 : 0;
        }
        return 2;
    }


    public int test2(String id) {
        Optional<String> checkId = Optional.ofNullable(id);
        if (checkId.isPresent()) {
            return list.stream().anyMatch(Person -> Person.getName().equals(checkId.get())) ? 1 : 0;
        }
        return 2;
    }


    public int checkPassword(String password) {
        Optional<String> checker = Optional.ofNullable(password);
        if (checker.isPresent()) {
            return (list.stream().anyMatch(Person -> Person.getName().equals(checker.get()))) ? 1 : 0;
        }
        return 2;
    }

    public int getYear() {
        return LocalDate.of(1, 1, 1).getYear();
    }


}

