<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                version="1.0">

    <xsl:output method="html"/>

    <xsl:template match="/">
        <xsl:for-each select="Infos/Info">
        <xsl:choose>
            <xsl:when test="commission = 500">
                <font color="#ff0000">
                    <xsl:text>NAME: </xsl:text>
                    <xsl:value-of select="name"/>
                    <xsl:text> AGE: </xsl:text>
                    <xsl:value-of select="age"/>
                    <xsl:text> Your Commission is $</xsl:text>
                    <xsl:value-of select="commission"/>
                    <xsl:text>.</xsl:text>
                    <br/>
                </font>
            </xsl:when>
            <xsl:when test="commission = 5000">
                <font color="#0000ff">
                    <xsl:text>NAME: </xsl:text>
                    <xsl:value-of select="name"/>
                    <xsl:text> AGE: </xsl:text>
                    <xsl:value-of select="age"/>
                    <xsl:text> Your Commission is $</xsl:text>
                    <xsl:value-of select="commission"/>
                    <xsl:text>.</xsl:text>
                    <br/>
                </font>
            </xsl:when>
            <xsl:otherwise>
                    <xsl:text>NAME: </xsl:text>
                    <xsl:value-of select="name"/>
                    <xsl:text> AGE: </xsl:text>
                    <xsl:value-of select="age"/>
                    <xsl:text> Your Commission is $</xsl:text>
                    <xsl:value-of select="commission"/>
                    <xsl:text>.</xsl:text>
                    <br/>
            </xsl:otherwise>
        </xsl:choose>
        </xsl:for-each>
    </xsl:template>
</xsl:stylesheet>