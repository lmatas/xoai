//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="client://java.sun.com/xml/jaxb">client://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.13 at 08:24:23 PM WET 
//

package com.lyncode.xoai.model.oaipmh;

import com.lyncode.xml.exceptions.XmlWriteException;
import com.lyncode.xoai.xml.XmlWriter;
import com.lyncode.xoai.xml.XmlWritable;


public class MetadataFormat implements XmlWritable {

    protected String metadataPrefix;
    protected String schema;
    protected String metadataNamespace;

    public String getMetadataPrefix() {
        return metadataPrefix;
    }

    public MetadataFormat withMetadataPrefix(String value) {
        this.metadataPrefix = value;
        return this;
    }

    public String getSchema() {
        return schema;
    }

    public MetadataFormat withSchema(String value) {
        this.schema = value;
        return this;
    }

    public String getMetadataNamespace() {
        return metadataNamespace;
    }

    public MetadataFormat withMetadataNamespace(String value) {
        this.metadataNamespace = value;
        return this;
    }

    @Override
    public void write(XmlWriter writer) throws XmlWriteException {
        if (metadataPrefix != null)
            writer.writeElement("metadataPrefix", metadataPrefix);
        if (schema != null)
            writer.writeElement("schema", schema);
        if (metadataNamespace != null)
            writer.writeElement("metadataNamespace", metadataNamespace);
    }

}
