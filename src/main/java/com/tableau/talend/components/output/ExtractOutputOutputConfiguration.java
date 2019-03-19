package com.tableau.talend.components.output;

import java.io.Serializable;

import com.tableau.talend.components.dataset.TdataSet;
import lombok.Data;
import org.talend.sdk.component.api.configuration.Option;
import org.talend.sdk.component.api.configuration.ui.layout.GridLayout;
import org.talend.sdk.component.api.meta.Documentation;

@GridLayout({
        // the generated layout put one configuration entry per line,
        // customize it as much as needed
        @GridLayout.Row({"OUTPUTFILE"}),
        @GridLayout.Row({"COLLATION"}),
        @GridLayout.Row({"VERSION", "TSERVER"}),
        @GridLayout.Row({"tdataSet"}),
        @GridLayout.Row({"SITE_ID","PROJECT_ID"}),
        @GridLayout.Row({"DATASOURCE"})
})
@Documentation("")
@Data
public class ExtractOutputOutputConfiguration implements Serializable {

    @Option
    @Documentation(" ")
    private TdataSet tdataSet;
    @Option
    @Documentation("")
    private String OUTPUTFILE;

    @Option
    @Documentation("")
    private String COLLATION;

    @Option
    @Documentation("")
    private String VERSION;

    @Option
    @Documentation("")
    private String TSERVER;

    @Option
    @Documentation("")
    private String SITE_ID;

    @Option
    @Documentation("T")
    private String PROJECT_ID;

    @Option
    @Documentation("")
    private String DATASOURCE;
}