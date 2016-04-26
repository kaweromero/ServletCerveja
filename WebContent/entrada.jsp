<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cervejaaaa!</title>
</head>
<body>

<h1>Escolha o tipo de cerveja! :D</h1>  
<hr/>
<hr/>     
        <form method="post" action="ProcessaCerveja">            
            
            <select name="tiposdecerveja">
           		<option value="americanlager">American Lager</option>
           		<option value="darkamericanlager">Dark American Lager</option>
  				<option value="premiumlager">Premium lager</option>
  				<option value="pilsner">Pilsner</option>
  				<option value="malzbier">Malzbier</option>
  				<option value="imperialipa">Imperial IPA</option>
  				<option value="brasileiras">BRASIL-il-il</option>
			</select>
          
           <input type="submit" value="Checar!"/>  
        </form> 
        
</body>
</html>