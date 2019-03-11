<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html" encoding="iso-8859-1"/>
    version="2.0">
	<xsl:template match="/juegoTanques">
		<html>
			<head>
				<title>Juego Tanques</title>
				<xsl:call-template name="css"/>
			</head>
			<body>
				<table>
					<tr>
						<th colspan="2">Jugador</th>
						<th>Jugada</th>
					</tr>
					
					<xsl:apply-templates select="jugadasDescritas/jugada"/>
				</table>
			</body>
		</html>
		
	</xsl:template>
	
	<xsl:template match="jugada">
		<tr>
			<td><xsl:value-of select="position()"/></td>
			<td><xsl:value-of select="@jugador"/></td>
			<td><xsl:value-of select="@desc"/></td>
		</tr>
		
	</xsl:template>
	
	<xsl:template name="css">
		<style type="text/css">
			th{
				color: white;
			}
		</style>
	</xsl:template>
</xsl:stylesheet>