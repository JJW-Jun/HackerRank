<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
    <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>





    <h1>List</h1>
<a id="home" href="#"> Go Home </a>



<table class="table">
    <thead>
    <tr>
        <th>#</th>
        <th>name</th>
        <th>password</th>
        <th>Age</th>
        <th>City</th>
        <th>Country</th>
    </tr>
    </thead>
    <tbody id="tbody">
    </tbody>
</table>




<script>
    $(`#home`).click(function() {
    location.href = `${c}`
})

    $.getJSON(`${c}/managers/list`, function(d) {
    $.each(d, function(i, j) {
        $(
            '<tr>' + '<th>' + j.name + '</th>' + '<th>' + j.password
            + '</th>' + '<th>' + test + '</th>' + '<th>' + test
            + '</th>' + '<th>' + test + '</th>' + '<th>' + test
            + '</th>' + '</tr>').appendTo('#tbody');
    })
});
</script>


