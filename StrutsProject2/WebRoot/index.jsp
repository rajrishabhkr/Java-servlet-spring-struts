<%@taglib uri="/struts-tags" prefix="s" %>
<s:form action="login">
<s:textfield name="name" label="UserName:"></s:textfield>
<s:password name="password" label="Password:"></s:password>
<s:submit value="FETCH" name="button"></s:submit>
<s:submit value="INSERT" name="button"></s:submit>
<s:submit value="DELETE" name="button"></s:submit>
<s:submit value="UPDATE" name="button"></s:submit>
</s:form>