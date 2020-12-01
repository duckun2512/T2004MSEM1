<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                version="1.0">

    <xsl:template match="/states">
        <html>
            <head>
                <title>
                    State Data
                </title>
            </head>
            <body>
                <h1>
                    State Data
                </h1>
                <table border="1">
                    <tr bgcolor="cyan">
                        <th>Name</th>
                        <th>Population</th>
                        <th>Capital</th>
                        <th>Bird</th>
                        <th>Flower</th>
                        <th>Area</th>
                    </tr>
                    <xsl:apply-templates/>
                </table>
            </body>
        </html>
    </xsl:template>

    <xsl:template match="state">
        <tr>
            <td>
                <xsl:value-of select="name"/>
            </td>
            <td>
                <xsl:apply-templates select="population"/>
            </td>
            <td>
                <xsl:apply-templates select="capital"/>
            </td>
            <td>
                <xsl:apply-templates select="bird"/>
            </td>
            <td>
                <xsl:apply-templates select="flower"/>
            </td>
            <td>
                <xsl:apply-templates select="area"/>
            </td>
        </tr>
    </xsl:template>

    <xsl:template match="population">
        <xsl:value-of select="."/>
        <xsl:text> </xsl:text>
        <xsl:value-of select="@units"/>
    </xsl:template>

    <xsl:template match="capital">
        <xsl:value-of select="."/>
    </xsl:template>

    <xsl:template match="bird">
        <xsl:value-of select="."/>
    </xsl:template>

    <xsl:template match="flower">
        <xsl:value-of select="."/>
    </xsl:template>

    <xsl:template match="area">
        <xsl:value-of select="."/>
        <xsl:text> </xsl:text>
        <xsl:value-of select="@units"/>
    </xsl:template>

</xsl:stylesheet>