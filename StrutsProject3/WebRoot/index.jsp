<%@taglib prefix="s" uri="/struts-tags"%>
<s:form action="login">
<s:textfield name="name" label="UserName:"></s:textfield>
<s:password name="password" label="Password:"></s:password>
<s:radio name="gender" label="Gender:" list="{'Male','Female'}"></s:radio>
<s:checkboxlist name="hobbies" label="Hobbies:" list="{'Song', 'Cricket', 'Football'}"></s:checkboxlist>
<s:select name="state" label="State" list="{'Bihar','MP','Delhi','Punjab'}"></s:select>
<s:combobox name="lang" label="Lang" list="{'Hindi','English','Urdu'}" ></s:combobox>
<s:submit value="submit"></s:submit>
</s:form>