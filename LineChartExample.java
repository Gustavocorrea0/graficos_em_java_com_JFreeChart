import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.JFrame;

public class LineChartExample {
    public static void main(String[] args) {
        // Create dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Series 1", "Category 1");
        dataset.addValue(2.0, "Series 1", "Category 2");
        dataset.addValue(3.0, "Series 1", "Category 3");
        dataset.addValue(4.0, "Series 1", "Category 4");
        dataset.addValue(5.0, "Series 1", "Category 5");

        // Create chart
        JFreeChart chart = ChartFactory.createLineChart(
                "Line Chart Example",
                "Category",
                "Value",
                dataset);

        // Create frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Add chart panel to frame
        ChartPanel chartPanel = new ChartPanel(chart);
        frame.add(chartPanel);

        // Show frame
        frame.setVisible(true);
    }
}
