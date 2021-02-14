package demo;

abstract class Player {


    // 미완성 메서드를 가지고 있는 클래스
    abstract void play(int pos);
    abstract void stop();

    // 다른 클래스 작성에 도움을 주기 위한 것. 인스턴스 생성 불가
    // ex) Player p = new Player();
}


class AudioPlayer extends Player{
    // 상속을 통해 추상 메서드를 완성해야 인스턴스 생성가
    void play(int pos){

    }

    void stop(){}

    // 객체 생성 가능.
    AudioPlayer ap =  new AudioPlayer();


    // 미완성 메서드 : 구현부(몸통{}가 없는 메서드
    // 주석을 통해 어떤 기능을 수행할 목적으로 만들었는지 설명한다 : 꼭 필요하지만 자손마다 다르게 구현될 것으로 예상되는 경우

}
// 둘 다 메서드 붙이거나 앞에 추상메서드 적거나
// 일부만 구현햏도 되고. 그때는 abstract를 써 줘야 한다.
class AbstractPlayer extends Player{
    void play(int pos){}

    @Override
    void stop() {

    }
}
