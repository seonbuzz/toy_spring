<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <%@
taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <%@ taglib
uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<link
  href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
  rel="stylesheet"
  integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
  crossorigin="anonymous"
/>
<div class="container">
  <nav aria-label="Page navigation example">
    <c:set var="_pagination" value="${resultMap.paginations}" />
    <span>총 갯수 : ${_pagination.totalCount}</span>
    <ul class="pagination">
      <li class="page-item">
        <a class="page-link" href="#" aria-label="Previous">
          <span aria-hidden="true">&laquo;</span>
          <span class="sr-only">Previous</span>
        </a>
      </li>
      <!-- <%-- for(int i=0;i > 9;i++){} --%> -->
      <c:forEach
        var="i"
        begin="${_pagination.blockStart}"
        end="${_pagination.blockEnd}"
      >
        <li class="page-item">
          <a class="page-link" href="/commonCodeOur/listPagination/1">${i}</a>
        </li>
      </c:forEach>
      <li class="page-item">
        <a class="page-link" href="#" aria-label="Next">
          <span aria-hidden="true">&raquo;</span>
          <span class="sr-only">Next</span>
        </a>
      </li>
    </ul>
  </nav>
</div>
