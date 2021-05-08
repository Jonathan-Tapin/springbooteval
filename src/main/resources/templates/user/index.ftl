<#include "../base/base.ftl"/>

<a href="/user/create">Create</a>
<table class="table">
  <thead class="table-light">
  <th>#</th>
  <th>Firstname</th>
  <th>Lastname</th>
  <th>Details</th>
  </thead>
  <tbody>
  <#list items as user>
    <tr>
      <td>${user.id}</td>
      <td>${user.firstname}</td>
      <td>${user.lastname}</td>
<#--      <td><a class="btn btn-primary" href="/users/details/${user.id}" role="button"><i class="fas fa-eye"></i></a></td>-->
    </tr>
  </#list>
  </tbody>
</table>