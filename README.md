Step 1.
We couldn't aquire suitable energy-data from our own smart-meters, so we were provided a data-set by the course-organizers

Step 2:
We used the provided template as basis for our Transformer.
Importing the project should work the same way as importing the original template.
Our Transformer is the `EETransformer.java` in the eddie.energy.transformer package.

The energy data we use was provided to us since our data wasn't suitable.
It can be found in the EE folder under the filename `EE_Test-Data_QH.xml`.

To generate the output file run the test case `testEETransformer()`.
The test case can be found in the energy.eddie.transformer package in `TestTransformer.java`.
This will generate `EE-Transformer-Output.xml`, which represents our transformed data in the `MyEnergyDataMarketDocument` format.

In order for the XML creation to work we had to add an @XmlRootElement annotation to MyEnergyDataMarketDocument.java
otherwise the creation would fail even for the provided Test-Transformers

The generated XML is automatically validated against the `myenergydata` XSD as part of the test.
The validation logic can be found in the eddie.energy.validation package in `XMLValidation.java`.

Step 3 TaskB:

Our EnergyData is from Estonia which is in timezone EET.
The function getMappedMarketDocumentFromTimezone(OriginTimeZone) takes an Enum as input and pretends the original timezone of the input data is either WET, CET, or EET
The generated Output's date Strings have the same format regardless of the specified input and show the time in UTC.
To make the data easier to use we limited the data to 24 hours in a single day, or in other words we cut off the last entries for CET and WET because 

To generate the output for all 3 timezones run the test case `testEETransformer()`.
The test case can be found in the energy.eddie.transformer package in `TestTransformer.java`.
This will generate `EE-Transformer-Output-CET.xml`, `EE-Transformer-Output-EET.xml`, and `EE-Transformer-Output-WET.xml`, which represents our transformed data in the `MyEnergyDataMarketDocument` format.


Dashboard:

Go to the dashboard folder and open the index.html file with any browser.
Here you can choose one of the 4 dashboards.

The data is intended to be used are the three XML-files: `EE-Transformer-Output-WET.xml`, `EE-Transformer-Output-CET.xml`, and `EE-Transformer-Output-EET.xml`

`Simple Line Dashboard` works with 1 or more files.

`Time Zone Comparison` requires at least 2 files.

`Zoomable Line View` requires all 3 files to be uploaded.

`Bar and Pie Summary` requires at least 2 files.



### Acknowledgements
The structure of the XML validation logic in `XMLValidation.java` was inspired by:
[How to Validate XML against XSD in Java – DigitalOcean](https://www.digitalocean.com/community/tutorials/how-to-validate-xml-against-xsd-in-java)