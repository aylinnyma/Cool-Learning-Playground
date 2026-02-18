// 1️⃣ IMPORT the class from JFreeChart's package
import org.jfree.data.category.DefaultCategoryDataset;
//    └─ This tells Java: "Look in the JFreeChart library for this class"
import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.category.*;
import javax.swing.*;
import java.util.*;

public class AirPollution {

    public static void main(String[] args) {

            // ============================================================
            // 🔹 ARRAYS: Fixed-size collections of values (created with [])
            // ============================================================

            // String array: 7 text values for days of the week
            // Format: type[] name = { value1, value2, ... };
            String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

            // double array: 7 numeric values for PM2.5 measurements
            // "double" means decimal numbers (like 12.5, not whole numbers)
            double[] pm25Values = {12.5, 15.2, 18.3, 11.4, 20.0, 25.3, 30.5};

            // 💡 Arrays have FIXED SIZE — you can't add/remove items after creation
            //    days[0] = "Mon"  (first item, index starts at 0)
            //    days[1] = "Tue"  (second item)
            //    days[6] = "Sun"  (seventh item — last one!)


            // ============================================================
            // 🔹 ARRAYLIST: Flexible-size collections (can grow/shrink)
            // ============================================================

            // Create an empty ArrayList to hold day names
            // Format: ArrayList<Type> name = new ArrayList<>();
            ArrayList<String> daysList = new ArrayList<>();

            // Add items one-by-one (unlike arrays, you can keep adding!)
            daysList.add("Mon");
            daysList.add("Tue");
            daysList.add("Wed");
            daysList.add("Thu");
            daysList.add("Fri");
            daysList.add("Sat");
            daysList.add("Sun");

            // 💡 ArrayLists are MORE FLEXIBLE than arrays:
            //    daysList.add("ExtraDay");  // ← This works! (arrays can't do this)
            //    daysList.remove(0);        // ← Remove first item (arrays can't do this)
            //    daysList.size();           // ← Returns 7 (like array.length)
            //    daysList.get(0);           // ← Returns "Mon" (like days[0])


            // ============================================================
            // 🔹 FOR LOOP: Repeat actions for each item in a collection
            // ============================================================

            // Create dataset for the chart (holds our data)
            // 2️⃣ CREATE an instance (like getting an empty spreadsheet)
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            //                                 └─ "new" means: create a fresh dataset object in memory


            // FOR LOOP that runs 7 times (once for each day)
            // Syntax: for (start; condition; increment) { code to repeat }
            for (int i = 0; i < days.length; i++) {
                // 🔸 i = 0 → first iteration (Monday)
                // 🔸 i = 1 → second iteration (Tuesday)
                // 🔸 ... continues until i = 6 (Sunday)
                // 🔸 i < days.length → stop when i reaches 7 (array has 7 items)

                // Get current day and value using the index "i"
                String currentDay = days[i];        // days[0] = "Mon", days[1] = "Tue", etc.
                double currentValue = pm25Values[i]; // pm25Values[0] = 12.5, etc.

                // Add this day/value pair to the chart dataset
                // Format: addValue(number, seriesName, categoryName)
                // 3️⃣ FILL it with data (like typing into spreadsheet cells)
                // dataset.addValue(12.5, "PM2.5", "Mon");
                //                 │      │       └─ Column name (category)
                //                 │      └─ Row name (series)
                //                 └─ Cell value
                dataset.addValue(currentValue, "PM2.5", currentDay);

                // 💡 What happens inside the loop (step-by-step):
                //    i=0: addValue(12.5, "PM2.5", "Mon")
                //    i=1: addValue(15.2, "PM2.5", "Tue")
                //    i=2: addValue(18.3, "PM2.5", "Wed")
                //    ... continues until i=6
            }


            // ============================================================
            // 🔹 CREATE THE CHART (JFreeChart magic)
            // ============================================================

            // Build a bar chart with title and axis labels
            JFreeChart chart = ChartFactory.createBarChart(
                    "Weekly Air Quality Report",  // Main title (top of chart)
                    "Day of Week",                // X-axis label (bottom)
                    "PM2.5 (µg/m³)",              // Y-axis label (left side)
                    dataset                       // Our data from the loop above
            );


            // ============================================================
            // 🔹 DISPLAY THE CHART IN A WINDOW
            // ============================================================

            // Create a window (JFrame) to show the chart
            ChartFrame frame = new ChartFrame("Air Quality Dashboard", chart);

            // Set window size (width=800 pixels, height=600 pixels)
            frame.setSize(800, 600);

            // Center the window on screen
            frame.setLocationRelativeTo(null);

            // Make the window visible (show it!)
            frame.setVisible(true);

            // 💡 Without setVisible(true), you won't see anything!
    }
}


