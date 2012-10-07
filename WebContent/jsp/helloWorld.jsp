<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@taglib prefix="s" uri="/struts-tags"%>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<title>Hello World</title>
<s:head />


<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />


<script language="JavaScript" type="text/javascript" src="<%=request.getContextPath()%>/js/maps.js"></script>

	<script type="text/javascript">
      var script = '<script type="text/javascript" src="<%=request.getContextPath()%>/js/markerclusterer';
      if (document.location.search.indexOf('compiled') !== -1) {
        script += '_compiled';
      }
      script += '.js"><' + '/script>';
      document.write(script);
    </script>
    
   

</head>

<body>

	Hello	<s:property value="name" />	, today is	<s:property value="dateNow" />	<br />

	

</body>
</html>


