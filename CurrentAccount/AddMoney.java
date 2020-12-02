/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Naman
 */
public class AddMoney extends javax.swing.JFrame {


    double value=0;
    double s=0;
    Login1 obj=null;
    public AddMoney( Login1 obj) {
        this.obj=obj;
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        inputadd = new javax.swing.JTextField();
        buttonadd = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputAdd = new javax.swing.JTextField();
        buttonAdd = new javax.swing.JButton();

        jLabel1.setText("Enter your money");

        inputadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputaddActionPerformed(evt);
            }
        });

        buttonadd.setText("Click to Add");
        buttonadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonaddActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add Money");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Enter your amount");

        inputAdd.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        inputAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAddActionPerformed(evt);
            }
        });

        buttonAdd.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        buttonAdd.setText("Add Money");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addGap(39, 39, 39)
                .addComponent(inputAdd)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(buttonAdd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(buttonAdd)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void buttonaddActionPerformed(java.awt.event.ActionEvent evt) {                                          
       
    }                                         

    private void inputaddActionPerformed(java.awt.event.ActionEvent evt) {                                         
      
      
           
    }                                        

    private void inputAddActionPerformed(java.awt.event.ActionEvent evt) {                                         

       
    }                                        

    public void replace(String a, String b,String c)
    {
        try {
        // input the file content to the StringBuffer "input"
        BufferedReader file = new BufferedReader(new FileReader("E:\\An1\\"+obj.l+ "\\"+obj.ac+ ".txt"));
        StringBuffer inputBuffer = new StringBuffer();
        String line;

        while ((line = file.readLine()) != null) {
            inputBuffer.append(line);
            inputBuffer.append('\n');
        }
        file.close();
        String inputStr = inputBuffer.toString();

       // System.out.println(inputStr); // display the original file for debugging

        // logic to replace lines in the string (could use regex here to be generic)
        
            inputStr = inputStr.replace(a + b, a + c);
        

        // display the new file for debugging
       // System.out.println("----------------------------------\n" + inputStr);

        // write the new string with the replaced line OVER the same file
        FileOutputStream fileOut = new FileOutputStream("E:\\An1\\"+obj.l+ "\\"+obj.ac+ ".txt");
        fileOut.write(inputStr.getBytes());
        fileOut.close();

    } catch (Exception e) {
        System.out.println("Problem reading file.");
    }
    }
    
    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {                                          
        try
        {
        value=Double.parseDouble(inputAdd.getText());
      
       if(value<0){ 
           JOptionPane.showMessageDialog(null,"You can enter only positive values");
           this.setVisible(false);
       }
       else
       {
           
            JOptionPane.showMessageDialog(null,"Amount added");
             this.setVisible(false);
       }
       //String s=Double.toString(value);
       String r ="E:\\An1\\"+obj.l+ "\\"+obj.ac+ ".txt";
       //System.out.println("In Add Money"+r);
       File f=new File(r);
            FileReader fr;
            String d="",q="";
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
      while((d=br.readLine())!=null)
      { System.out.println(d);
          if(d.contains("Money : "))
          { System.out.println("R");
              System.out.println("P" +d.substring(8));
               double x=Double.parseDouble(d.substring(8));
              s=s+value+x;
              q="Money : "+(Double.toString(s));
              System.out.println(q);
              replace("",d,q);
          }
      }
           
    //   new File1().update("Money",s,obj);
    
    }
        catch(Exception e )
        {
            e.getStackTrace();
        }
    }
    
    
             
             /*
             FileReader 
             file read
             Money find 
             Filewriter
             
             
            
                   
       }
//       Scanner sc=new Scanner("CSV"+obj.id+".txt");
//       double v=0;
//       String s="";
//       while(sc.hasNext())
//       {
////           v=Double.parseDouble(sc.next());
////             v=Double.valueOf(sc.next());
////           s=sc.next();
////           v=
////           v=sc.nextDouble();
//           JOptionPane.showMessageDialog(null,sc.next());
//           JOptionPane.showMessageDialog(null,sc.nextDouble());
//       }
//       
//       //Overwriting the current value
//         JOptionPane.showMessageDialog(null, v);
//         FileWriter fw=new FileWriter("CSV"+obj.id+".txt",false);
//         BufferedWriter bw=new BufferedWriter(fw);
//         
//         bw.write(""+value+v);
//         bw.close();
//         fw.close();
//         sc.close();
        
       }
       
       
     
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Exception Caught"+e.getMessage());
        }
    }                                         

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
Login1 obj = new Login1();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new AddMoney(obj).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonadd;
    private javax.swing.JTextField inputAdd;
    private javax.swing.JTextField inputadd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration                   
}
