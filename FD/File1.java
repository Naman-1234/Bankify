/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
// import org.apache.commons.io.FileUtils;
// import org.springframework.util.FileSystemUtils; 
import static java.nio.file.StandardCopyOption.*;
/**
 *
 * @author Rakshilkumar
 */
public class File1 {
//    public void copyDirectory(File sourceLocation , File targetLocation)
//    throws IOException {
//
//        if (sourceLocation.isDirectory()) {
//            if (!targetLocation.exists()) {
//                targetLocation.mkdir();
//            }
//
//            String[] children = sourceLocation.list();
//            for (int i=0; i<children.length; i++) {
//                copyDirectory(new File(sourceLocation, children[i]),
//                        new File(targetLocation, children[i]));
//            }
//        } else {
//
//            InputStream in = new FileInputStream(sourceLocation);
//            OutputStream out = new FileOutputStream(targetLocation);
//
//            // Copy the bits from instream to outstream
//            byte[] buf = new byte[1024];
//            int len;
//            while ((len = in.read(buf)) > 0) {
//                out.write(buf, 0, len);
//            }
//            in.close();
//            out.close();
//        }
//    }
  public boolean check(String s,Registration obj)throws IOException
   {
       try
       {
           FileInputStream fin = new FileInputStream("E:\\An1\\"+s);
           DataInputStream r = new DataInputStream(fin);
           int sa = r.readInt();
           return (sa==1)?true:false;
       }
       catch(FileNotFoundException e)
       { int i=readNoofaccount(s,obj);

           new File("E:\\An1\\"+s).mkdir();
           FileOutputStream fout;
           fout = new FileOutputStream("E:\\An1\\"+s+"\\"+(s.substring(0,2))+" "+(i)+".txt");
           DataOutputStream r = new DataOutputStream(fout);
           //r.writeInt(1);
           r.write(("Username : "+(new Next(obj).t)).getBytes());
           r.write(System.getProperty( "line.separator" ).getBytes());
           r.write(("Password : "+(new Next(obj).y)).getBytes());
           r.write(System.getProperty( "line.separator" ).getBytes());
           r.write(("Name : "+obj.nam).getBytes());
           r.write(System.getProperty( "line.separator" ).getBytes());
           r.write(("Father's Name : "+obj.fat).getBytes());
           r.write(System.getProperty( "line.separator" ).getBytes());
           r.write(("Date of birth : "+obj.d).getBytes());
           r.write(System.getProperty( "line.separator" ).getBytes());
           
           r.write(("Date of Opening "+s+" Account : "+(new Next(obj)).dat).getBytes());
           r.write(System.getProperty( "line.separator" ).getBytes());
           r.write(("Gender : "+obj.gender).getBytes());
           r.write(System.getProperty( "line.separator" ).getBytes());
            r.write(("Addhar Card : "+(obj.ac)).getBytes());
             r.write(System.getProperty( "line.separator" ).getBytes());
             
               r.write(("Mobile No : "+obj.mo).getBytes());
               r.write(System.getProperty( "line.separator" ).getBytes());
               r.write(("Occupation : "+obj.jo).getBytes());
               r.write(System.getProperty( "line.separator" ).getBytes());
               r.write(("Address : "+obj.adr).getBytes());
               r.write(System.getProperty( "line.separator" ).getBytes());
               
               String msg="";
               msg="<html> YOUR ACCOUNT HAS BEEN SUCCESSFULL CREATED !!! <br>"+
                       "<br>"
                       + "PLEASE REMEMBER YOUR UNIQUE ACCOUNT ID GIVEN BELOW <br>"+"<br>"
                                + "YOUR ACCOUNT ID IS:  "+(s.substring(0,2))+" "+(i)+ "</html>";
             JOptionPane op = new JOptionPane();
        op.setMessage(msg);
     
        op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = op.createDialog(null,"Important Note");
        dialog.setVisible(true);
               
               
//               String z=new Next(obj).t;
//               System.out.println(z);
              // System.out.println(new Next(obj).t);
               
      //iska socho 
              if(s.equals("FD"))
            {
                r.write(("Age of Person is : "+(new Fd().age)).getBytes());
                r.write(System.getProperty( "line.separator" ).getBytes());
                r.write(("Principal amount deposited is : "+new Fd(obj).pr).getBytes());
                r.write(System.getProperty( "line.separator" ).getBytes());
                r.write(("Time period of FD : "+new Fd(obj).ti).getBytes());
                r.write(System.getProperty( "line.separator" ).getBytes());
                r.write(("Amount at maturity : "+new Fd(obj).amt).getBytes());
                r.write(System.getProperty( "line.separator" ).getBytes());
            }
              else if(s.equals("CURRENT ACCOUNT"))
              {
                  r.write(("Money : 0.0").getBytes());
                  r.write(System.getProperty( "line.separator" ).getBytes());
                  r.write(("request : ").getBytes());
                  r.write(System.getProperty( "line.separator" ).getBytes());
                  r.write(("Beneficiary : ").getBytes());
                  r.write(System.getProperty( "line.separator" ).getBytes());
              }
               else if(s.equals("SAVING'S ACCOUNT"))
              {
                  r.write(("Money : 0.0").getBytes());
                  r.write(System.getProperty( "line.separator" ).getBytes());
                  r.write(("request : ").getBytes());
                  r.write(System.getProperty( "line.separator" ).getBytes());
                  r.write(("Beneficiary : ").getBytes());
                  r.write(System.getProperty( "line.separator" ).getBytes());
              }
               
//
           
           return true;
       }
   }
  public String get1(Registration obj) throws IOException,NumberFormatException
  { String x = new Next(obj).value; 
      return (x+readNoofaccount(x,obj)+1);
  }
    
    public int addAccount(Registration obj)throws IOException
    {  String x= new Next(obj).value;
        int i=readNoofaccount(x,obj);
       if(!check(x,obj)) {
           new File("E:\\An1\\"+x+"\\").mkdir();
           new File("E:\\An1\\"+x+"\\"+(x.substring(0, 1))+" "+(i)+".txt");
           
          
//           if(c.equals("FD"))
//           {
//               FileOutputStream fw=new FileOutputStream("C:\\Users\\Admin\\OneDrive\\Desktop+new Next().value+"\\"+new Next().value+(i+1));
//               DataOutputStream dw=new DataOutputStream(fw);
//
//               dw.write((new Registration().adr).getBytes());
//               dw.write(new Registration().ac.getBytes());
//               dw.write(new Registration().mo.getBytes());
//               dw.write(new Registration().jo.getBytes());
//               dw.write(new Registration().nam.getBytes());
//               dw.write(new Registration().fat.getBytes());
//               dw.write(new Registration().d.getBytes());
//
//
//
//
//
//               dw.close();
//               fw.close();
//           }
       }
       return (0);
    }
   
    private int readNoofaccount(String value,Registration obj) throws IOException {
        try
        {
            File fin = new File("E:\\An1\\"+new Next(obj).value);
         
            int n = fin.listFiles().length;
          
            
            return n;
        }
        catch(FileNotFoundException e)
        {
            return 0;
        }
        catch(NullPointerException e)
        {
            return 0;
        }
    }

    public void update(String check,String v,Registration obj) throws FileNotFoundException, IOException
     { 
           String x= new Next(obj).value;
       
       String line="";

        int i=readNoofaccount(x,obj);
        String oldstring="";
      
//        if(check.equals("Money"))
//        {
//            String temp="";
//            String path="E:\\An1\\"+x+"\\"+x+i+".txt";
//            String path1="E:\\An1\\"+x+"\\get.txt";
//            File f=new File(path);
//            FileReader fr=new FileReader(f);
//            BufferedReader br = new BufferedReader(fr);
//            File f1=new File(path1);
//            FileWriter fw=new FileWriter(f1);
//            FileReader fre=new FileReader(f1);
//             BufferedReader bre = new BufferedReader(fre);
////            while ((line = br.readLine()) != null) {
////                System.out.println(line);
////                if (line.contains("Money"))
////                {
////                 continue;
////                }
////                fw.write(line);
////            }
////           while ((line = bre.readLine()) != null) {
////                System.out.println(1);
////                
////                
////            }
//            try
//            {
//           
//            String newstring="Money : "+v;
//            //System.out.println(oldstring);
//           // System.out.println(newstring);
//
// Files.write(Paths.get(path), newstring.getBytes(), StandardOpenOption.APPEND);

            String temp="";
            String path="E:\\An1\\"+x+"\\"+(x.substring(0, 1))+" "+(i+1)+".txt";
           // String path1="E:\\An1\\"+x+"\\get.txt";
            File f=new File(path);
            FileReader fr=new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            //File f1=new File(path1);
            //FileWriter fw=new FileWriter(f1);
           // FileReader fre=new FileReader(f1);
            // BufferedReader bre = new BufferedReader(fre);
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//                if (line.contains("Money"))
//                {
//                 continue;
//                }
//                fw.write(line);
//            }
//           while ((line = bre.readLine()) != null) {
//                System.out.println(1);
//                
//                
//            }
            try
            {
           
            String newstring=check+ " : "+(Double.parseDouble(v));
            //System.out.println(oldstring);
           // System.out.println(newstring);

 Files.write(Paths.get(path), newstring.getBytes(), StandardOpenOption.APPEND);
            
           //boolean success=f1.renameTo(f);
//           System.out.println(success);


            
            }
            catch(IOException e)
            {
                e.getStackTrace();
            }



            br.close();
            fr.close();
          // bre.close();
            
            

       
        
    }
    public void make(String a,String b,String c,String d )
    {
        
    }
    
}
