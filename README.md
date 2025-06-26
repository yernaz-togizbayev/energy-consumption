# ⚡ Foundations of Networked Systems Project – Energy Data Transformation & Visualization

This project explores the challenges of accessing and processing **real-world smart meter energy data** across different countries, and transforming it into **CIM-compliant XML format**. It further visualizes this data using interactive dashboards, simulating consumption patterns across **three European time zones**.
---

## 🌍 Project Overview

The project is structured into **three core components**:

1. **Energy Data Access**
   - Attempted real-world smart meter access from Austria, Afghanistan, and Iran.
   - Due to limited data export options in AFG/IRN, the group used **Estonian sample data** (XML) from the course.
   - Comparative summary included in the final report.

2. **Data Transformation**
   - Developed a `EETransformer` in Java to convert Estonian XML to **CIM (Common Information Model)** format.
   - Implemented **time zone simulation** (WET, CET, EET).
   - Validation performed with XML Schema Definition (XSD).
   - Java test classes ensure compliance and correctness of output:
     - `TestTransformer.java`
     - `XMLValidation.java`

3. **Interactive Dashboards**
   - Built with **HTML5, JavaScript, and D3.js**
   - Upload and visualize XML data across time zones.
   - 4 Dashboards, one per contributor:
     - Line chart, bar chart, pie chart, and dynamic selection
   - Features include time zone conversion, file upload, grouped comparisons, and interactivity.

---

## 🛠 Technologies Used

- **Java** (DOM Parser, file validation, UUID generation)
- **D3.js** for visual analytics
- **HTML5**, **CSS**, **JavaScript**
- **XML / XSD** schema for CIM compliance

---

## 🧪 Features Implemented

- ✅ Smart meter data access evaluation (AUT, AFG, IRN)
- ✅ Transformation of Estonian XML to CIM-compliant format
- ✅ Output support for **3 time zones** (UTC+0, +1, +2)
- ✅ XML validation via Java
- ✅ 4 interactive dashboards:
  - Line chart
  - Bar and Pie charts
  - Zoomable chart
  - Color-coded time comparison chart

---

## 📁 Project Structure

| File / Folder | Description |
|---------------|-------------|
| `/transformer/` | Java code for XML parsing and CIM transformation |
| `/validation/` | Java test and validation utilities |
| `/dashboards/` | HTML + JS dashboards (one per member) |
| `EE-Transformer-Output-{WET,CET,EET}.xml` | Example output for each time zone |
| `FNS_Project_Group27.pdf` | Final report including documentation, comparisons, and visuals |

---

## 📄 License

This project was developed as part of the **Foundations of Networked Systems** course at the University of Vienna. Shared for academic and educational purposes only.

