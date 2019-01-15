<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html" encoding="iso-8859-1"/>
	<xsl:template match="ligaEndesa">
		<html>
			<head>
				<title>Liga Baloncesto Endesa </title>
				<style type="text/css">
					h1{
						text-decoration: underline;
						
					}
					
					body{
						background-color: blue;
						color: white;
						
					}
					li:hover{
						font-weight: bold;
					}
				</style>
			</head>
			<body>
				<h1>Liga Endesa</h1>
				<ul>
					<li><p>Fecha Creacion: <xsl:value-of select="fechaCreacion"/></p></li>
					<li><p>Nombre Completo: <xsl:value-of select="nombreCompleto"/></p></li>
					<li><p>Numero de Equipos: <xsl:value-of select="equipos"/></p></li>
				</ul>
			</body>
		</html>
		
	</xsl:template>
</xsl:stylesheet>