package com.tableau.talend.components.dataset;

import java.io.Serializable;

import com.tableau.talend.components.datastore.TdataStore;

import lombok.Data;
import org.talend.sdk.component.api.configuration.Option;
import org.talend.sdk.component.api.configuration.type.DataSet;
import org.talend.sdk.component.api.configuration.ui.layout.GridLayout;
import org.talend.sdk.component.api.meta.Documentation;

@DataSet("TdataSet")
@GridLayout({
    // the generated layout put one configuration entry per line,
    // customize it as much as needed
    @GridLayout.Row({ "datastore" })
})
@Documentation("")
@Data
public class TdataSet implements Serializable {
    @Option
    @Documentation("")
    private TdataStore datastore;



}