<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html" encoding="iso-8859-1"/>

	<xsl:template match="/navidad">
		<html>
			<head>
				<title>Comida Navidad</title>
				<style type="text/css">
					
					
					h1{
						 text-decoration: underline;
					}
				</style>
			</head>
			<body>
				<h1>Almuerzo</h1>
					<ul>
						<li><p>Primer Plato: <xsl:value-of select="almuerzo/primerPlato"/></p></li>
						<li><p>Segundo Plato: <xsl:value-of select="almuerzo/segundoPlato"/></p></li>
						<li><p>Postre: <xsl:value-of select="almuerzo/postre"/></p></li>
						<li><p>Bebida: <xsl:value-of select="almuerzo/bebida"/></p></li>
					</ul>	
				<h1>Sobremesa</h1>
					<ul>
						<li><p>Primera Copa: <xsl:value-of select="almuerzo/sobremesa/primeraCopa"/></p></li>
						<li><p>Segunda Copa:  <xsl:value-of select="almuerzo/sobremesa/segundaCopa"/></p></li>
						<li><p>Tercera Copa: <xsl:value-of select="almuerzo/sobremesa/terceraCopa"/></p></li>
					</ul>
				
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>