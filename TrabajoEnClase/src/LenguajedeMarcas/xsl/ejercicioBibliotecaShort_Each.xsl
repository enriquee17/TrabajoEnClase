<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="html" encoding="iso-8859-1"/>
	<xsl:template match="/biblioteca">
		<html>
			<head>
		        <title>Superheroes</title>
	     		<xsl:call-template name="css"/>
				
			</head>
			<body>
				<xsl:for-each select="libro">
					<xsl:sort select="autor" order="ascending"/>
					<ul>
					 	<li><h1>Titulo: </h1><p><xsl:value-of select="titulo"/></p></li>
					 	<li><h1>Autor: </h1><p><xsl:value-of select="autor/@fechaNacimieto"/></p></li><p><xsl:value-of select="autor"/></p>
					 	<li><h1>Fecha Publicacion: </h1><p><xsl:value-of select="fechaPublicacion/@año"/></p></li>
	 				</ul>
				</xsl:for-each>
			</body>
			
		</html>
		
	</xsl:template>
	
	 <xsl:template name="css">
	    <style type="text/css">
	      body {
	     
	      background: #2372DE;
	      font-family: 'Open Sans', sans-serif;
	      font-size: 11pt;
	      color: #FFFFFF;
	      
	      }
	      
	     
	    </style>
  </xsl:template>
</xsl:stylesheet>