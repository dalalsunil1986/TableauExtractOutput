package com.tableau.talend.components.datastore;

import java.io.Serializable;

import lombok.Data;
import org.talend.sdk.component.api.configuration.Option;
import org.talend.sdk.component.api.configuration.type.DataStore;
import org.talend.sdk.component.api.configuration.ui.layout.GridLayout;
import org.talend.sdk.component.api.configuration.ui.widget.Credential;
import org.talend.sdk.component.api.meta.Documentation;

@DataStore("TdataStore")
@GridLayout({

    @GridLayout.Row({ "username" ,"password" }),
})
@Documentation("")
@Data
public class TdataStore implements Serializable {


    @Option
    @Documentation("")
    private String username;

    @Credential
    @Option
    @Documentation("")
    private String password;

}