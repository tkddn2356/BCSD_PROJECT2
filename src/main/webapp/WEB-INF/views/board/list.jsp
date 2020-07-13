<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../includes/header.jsp" %>
<div class="container" style="margin-top: 100px">
    <div class="card">
        <div class="card-body">
            <h4 class="card-title"><c:out value="${category}"/></h4>
            <table class="table table-hover" id='board_list'>
                <thead>
                <tr>
                    <th class="text-center d-none d-md-table-cell">글번호</th>
                    <th class="w-50">제목</th>
                    <th class="text-center d-none d-md-table-cell">작성자</th>
                    <th class="text-center d-none d-md-table-cell">작성날짜</th>
                </tr>
                </thead>
                <tbody class="board-tbody">
<%--                    <tr>--%>
<%--                        <td class="text-center d-none d-md-table-cell"><c:out value="${board.id}"/></td>--%>
<%--                        <td class="w-50"><a href="${board.id}">--%>
<%--                            <c:out value="${board.title}"/></a></td>--%>
<%--                        <td class="text-center d-none d-md-table-cell"><c:out value="${board.writer}"/></td>--%>
<%--                        <td class="text-center d-none d-md-table-cell"><c:out value="${board.regdate}"/></td>--%>
<%--                    </tr>--%>
                </tbody>
            </table>
            <div class="text-right">
                <a href="/board/write?board_info_id=${board_info_id}"
                   class="btn btn-primary">글쓰기</a>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript" src="/resources/js/board.js"></script>
<script>
    $(document).ready(function () {
        console.log("Ready");
        var category = '<c:out value="${category}"/>';
        var board_tbody = $('.board-tbody');
        showList();
        function showList(){
            boardService.getList(category, function(list){
                console.log("category = " + category);
                var str = "";
                for(var i=0, len=list.length; i<len; i++){
                    str += "<tr>";
                    str += "<td class='text-center d-none d-md-table-cell'>"+list[i].id+"</td>";
                    str += "<td class='w-50'>"+list[i].title+"</td>";
                    str += "<td class='text-center d-none d-md-table-cell'>"+list[i].writer+"</td>";
                    str += "<td class='text-center d-none d-md-table-cell'>"+list[i].reg_date+"</td>";
                    str += "</tr>";
                }
                board_tbody.html(str);
            });
        }
    });

</script>

<script>
    $(document).ready(function () {
        var moveForm = $("#moveForm");

        $('.page-item a').on("click", function (e) {
            e.preventDefault();
            moveForm.find("input[name='pageNum']").val($(this).attr("href"));
            moveForm.find("input[name='id']").remove();
            moveForm.submit();
        });

        $('.w-50 a').on("click", function (e) {
            e.preventDefault();
            moveForm.attr("action", "/board/read");
            moveForm.find("input[name='id']").val($(this).attr("href"));
            moveForm.submit();
        });
    });

</script>


<%@include file="../includes/footer.jsp" %>






