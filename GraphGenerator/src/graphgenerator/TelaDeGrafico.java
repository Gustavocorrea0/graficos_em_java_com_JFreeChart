package graphgenerator;

import java.awt.Color;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class TelaDeGrafico extends JFrame {

    public TelaDeGrafico() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Grafico");
        setSize(950, 700);
        setLocationRelativeTo(null);
        
        //criarGraficoDePizza();
        //criarGraficoBarras();
        criarGraficoDeLinhas();
       
       setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        new TelaDeGrafico().setVisible(true);
    }
    
    public void criarGraficoDePizza(){
        DefaultPieDataset pizza = new DefaultPieDataset();
        //                            TITULO,  VALOR
        pizza.setValue("Janeiro", 1500);
        pizza.setValue("Fevereiro", 2500);
        pizza.setValue("Março", 2200);
        pizza.setValue("Abril", 2550);
        pizza.setValue("Maio", 3000);
        pizza.setValue("Junho", 2800);
                                                                                             // TITULO                                     , Grafico,       Legenda, apresenta informações da fatia, URL
        JFreeChart grafico = ChartFactory.createPieChart("Valores Recebidos", pizza, true, true, false);
        
        // Mudar cor da fatia
        
        PiePlot fatia = (PiePlot) grafico.getPlot();
        fatia.setSectionPaint("Brasil", Color.BLUE);
        fatia.setSectionPaint("Uruguay", Color.BLUE);
        
        // Gerar Painel
        ChartPanel painel = new ChartPanel(grafico);
        add(painel);
        
        
    }
             
    public void criarGraficoBarras(){
        
        DefaultCategoryDataset barra = new DefaultCategoryDataset();
                               // VALOR,           TITULO,          SUBTITULO
        barra.setValue(1500, "Janeiro", "");
        barra.setValue(1760, "Fevereiro", "");
        barra.setValue(2000,"Março", "");
        barra.setValue(1900, "Abril", "");
        barra.setValue(2365, "Maio", "");
        barra.setValue(4000, "Junho", "");
        
        // Grafico comun
        //                                                                                      Legenda,                Legenda,            Legenda,   DADO,             Orientacao,                        
        //JFreeChart grafico = ChartFactory.createBarChart("A", "B", "C", barra, PlotOrientation.VERTICAL, true, true , false);
        
        // Grafico 3D
        JFreeChart grafico = ChartFactory.createBarChart3D("Valores Recebidos", "Meses", "Valores", barra, PlotOrientation.VERTICAL, true, true , false);
        ChartPanel painel = new ChartPanel(grafico);
        
        // Mudar cor da barra
        CategoryPlot barraItem = grafico.getCategoryPlot();
        
        //                                                            Barra,  Cor
        barraItem.getRenderer().setSeriesPaint(0, Color.cyan);
        
        add(painel);
    }

    public void criarGraficoDeLinhas() {
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(100, "Series 1", "Category 1");
        dataset.addValue(300, "Series 1", "Category 2");
        dataset.addValue(50, "Series 1", "Category 3");
        dataset.addValue(400, "Series 1", "Category 4");
        dataset.addValue(200, "Series 1", "Category 5");
        
        JFreeChart chart = ChartFactory.createLineChart( "Line Chart Example","Category", "Value", dataset);
        
        ChartPanel painel = new ChartPanel(chart);
        add(painel);
    }
}

}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

