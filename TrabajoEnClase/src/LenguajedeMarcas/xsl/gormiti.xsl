<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html" encoding="iso-8859-1"/>
	<xsl:template match="/gormitis">
	
	 <html>
      <head>
        <title>Gormitis</title>
        <xsl:call-template name="css"/>
      </head>
      <body>
      	<table>
      		<tr>
      			<th></th>
      			<th>Gormiti</th>
      			<th >Tribu</th>
      		</tr>
      		
      		<xsl:for-each select="gormiti">
      			<xsl:choose>
      				<xsl:when test="position() mod 2 = 1">
      					<xsl:call-template name="filaEnTablaJugadasDescritasDeOtraManera">
							<xsl:with-param name="color">#c9ddff</xsl:with-param>
						</xsl:call-template>
      				</xsl:when>
      				<xsl:otherwise>
						<xsl:call-template name="filaEnTablaJugadasDescritasDeOtraManera">
							<xsl:with-param name="color">#ffffff</xsl:with-param>
						</xsl:call-template>
				  	</xsl:otherwise>
      			</xsl:choose>
      		</xsl:for-each>
				</table>
			</body>
		</html>
	</xsl:template>
	
	
	 <xsl:template name="filaEnTablaJugadasDescritasDeOtraManera">
  	<xsl:param name="color"/>
  	<tr bgcolor="{$color}">
  		<td class="numero"><xsl:value-of select="position()"/></td>
  		<td><img src="{.}"/></td>
  		<td class="negrita"><xsl:value-of select="@tribu"/></td>
  		
  		
  	</tr>
  </xsl:template>
	
	
	<xsl:template name="css">
		<style type="text/css">
			th {
      background: #2372DE;
      font-weight: bold;   
      text-align: center;
      color:white;
      }
      .numero{
      	font-weight:bold;
      		width:10%;
      }
      .negrita{
      	font-weight:bold;
      
      	
      }
      
      table{
      	margin-left:50px;
      }
      img{
      	width:20%;
      }
      
     
		</style>
	</xsl:template>
</xsl:stylesheet>