<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="html" encoding="iso-8859-1" />
	<xsl:template match="/partidoBaloncesto">
		<html>
			<head>
				<title>Partido Baloncesto</title>

				<xsl:call-template name="css" />
			</head>

			<body>
				<div style="width: 1000px; margin: 0 auto;">
					<p>Baloncesto: Baloncesto Lucena - Unicaja Baloncesto</p>
					

					<xsl:apply-templates select="equipo" />
					<xsl:apply-templates select="historico" />
				


				</div>
			</body>
		</html>
	</xsl:template>

	
	
	
	
	
	<xsl:template match="equipo">
		<table border="1">
			<tr>
				
				<td>Equipo</td>
				<td>Jugador</td>
				<td>Dorsal</td>
				<td>Apodo</td>
				<td>Puntos</td>
				<td>Rebotes</td>
				<td>Asistencias</td>
				
			</tr>
			<xsl:for-each select="jugador">
				<tr>
					<td><xsl:value-of select="@imagen"/></td>
					<td><xsl:value-of select="@nombre"/></td>
					<td><xsl:value-of select="@dorsal"/></td>
					<td><xsl:value-of select="@apodo"/></td>
					<td><xsl:value-of select="@puntos"/></td>
					<td><xsl:value-of select="@rebotes"/></td>
					<td><xsl:value-of select="@asistencias"/></td>
					
				</tr>
			</xsl:for-each>
		</table>
		<br/>
	</xsl:template>
	
	<xsl:template match="historico">
		<table border="1">
			<tr>
				
				<td>Tiempo</td>
				<td>Jugador</td>
				<td>Apodo</td>
				<td>Descripcion</td>
				<td>Icono</td>
				
			</tr>
			<xsl:for-each select="entrada">
				<tr>
					<td><xsl:value-of select="@tiempo"/></td>
					<td><xsl:value-of select="@jugador"/></td>
					<td><xsl:value-of select="../equipo/jugador/@apodo"/></td>
					<td><xsl:value-of select="."/></td>
					
				</tr>
			
			</xsl:for-each>
	
	</table>
		
	</xsl:template>
	
	
	
	
	
	
	

	<xsl:template name="hora">
		<xsl:param name="color"/>
		<td style="background:#{$color};"><xsl:value-of select="."/></td>
	</xsl:template>
	
	
	<xsl:template name="css">
      <style type="text/css">
                    body {
                    font-family: Arial;
                    font-size: 12px;
                    }
                    
                    ol, ul
                    {
                    margin-top: 10px;
                    margin-left: 0px;
                    }
                    
                    #menu li
                    {
                    margin-left: 0px;
                    display: inline;
                    list-style-type: none;
                    padding: 10px 50px;
                    }
                    
                    .noticia {
                    /* border: #000 solid 1px; */
                    padding: 10px 5px;
                    float: left; 
                    width: 338px;
                    }
                    
                    .noticia img {
                    width: 338px;
                    }
                    
                    .noticiaDobleAncho {
                    /* border: #000 solid 1px; */
                    padding: 10px 5px;
                    float: left; 
                    width: 690px;
                    }
                    
                    .noticiaDobleAncho img {
                    width: 690px;
                    }
                    
                    .fechaNoticia {
                    color: #A3A34B;
                    }
                    
                    .comentariosNoticia {
                    color: #A3A34B;
                    padding-left: 20px;
                    }
                    
                    .divPublicidad {
                    /* border: #000 solid 1px; */
                    padding: 10px 5px;
                    float: right; 
                    width: 280px;                    }
                    }
                    
                    .divPublicidad img {
                    width: 200px;
                    }
   		</style>
	</xsl:template>
	
</xsl:stylesheet>