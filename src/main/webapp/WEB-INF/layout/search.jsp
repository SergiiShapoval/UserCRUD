<%@include file="taglib.jsp"%>
<%@page isELIgnored="false" %>
<h1>Filter results</h1>
<form action="/filter" method="POST" >
    <table class="table table-responsive table-condensed table-hover table-responsive">
        <tr>
            <td>Name</td>
            <td><input name="name" class="form-control" type="text"  value="${filter}"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <button type="submit" name="action" value="Filter" class="btn btn-default btn-block" > <span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span> Filter</button>
            </td>

        </tr>
        <tr>
            <td colspan="2">
                <button type="submit" name="action" value="Clear" class="btn btn-default btn-block" > <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span> Clear Filter</button>
            </td>
        </tr>
    </table>
</form>
