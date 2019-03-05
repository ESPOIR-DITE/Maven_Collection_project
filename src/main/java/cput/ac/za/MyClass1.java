package cput.ac.za;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


public  class MyClass1 extends JFrame implements ActionListener
{

    String names;
    String facultys;
    int phones;
    int xy=0;
private JLabel title = new JLabel("REGISTRATION");
private JLabel name = new JLabel("NAME");
private JLabel phone = new JLabel("PHONE");
private JLabel faculty = new JLabel("FACULTY");

private JTextField namefiled = new JTextField(10);
private JTextField phonefield = new JTextField(10);
private  JTextField facultyfield = new JTextField(10);
private JTextArea textArea = new JTextArea(20,20);

private JButton cancelbtn = new JButton("SEARCH");
private JButton savebtn = new JButton("SAVE");
private JButton viewbtn = new JButton("VIEW");
    Student student;
    ArrayList<Student> objects= new ArrayList<>();                      //ArrayList
    HashSet<Student>hashSet=new HashSet<>();                            //HashSet
    HashMap<String, Integer> hashMap= new HashMap<String, Integer>();   //HashMap
     GridBagConstraints xosa;
     private GridBagLayout pan1;
    JPanel pan2 = new JPanel();

    public MyClass1() throws HeadlessException {
        super();
        pan1= new GridBagLayout();
        xosa = new GridBagConstraints();
        setLayout(pan1);
       // setLayout(new BorderLayout());
        //pan1.setLayout(new );
        //xosa.fill = GridBagConstraints.BOTH;
        addComponent(title,0,0,4,1);
        addComponent(name,1,0,1,1);
        addComponent(phone,2,0,1,1);
        addComponent(faculty,3,0,1,1);
        addComponent(cancelbtn,4,0,1,1);


        addComponent(namefiled,1,1,2,1);
        addComponent(phonefield, 2,1, 2,1);
        addComponent(facultyfield,3,1,2,1);
        addComponent(savebtn,4,1,1,1);
        addComponent(viewbtn,4,2,1,1);
        addComponent(textArea,1,3,1,4);
        savebtn.addActionListener(this);
        viewbtn.addActionListener(this);
        cancelbtn.addActionListener(this);
    }
private  void addComponent(Component component, int row,int column,int width,int height){
    xosa.gridx = column; // set gridx
    xosa.gridy = row; // set gridy
    xosa.gridwidth = width; // set gridwidth
    xosa.gridheight = height; // set gridheight
pan1.setConstraints( component, xosa ); // set constraints
    add( component );
}

    @Override
    public void actionPerformed(ActionEvent e) {



        if(e.getSource()==savebtn)
        {
            names=namefiled.getText();
            facultys=facultyfield.getText();
            phones=Integer.parseInt(phonefield.getText());

            System.out.println(""+names);
            student= new Student(names,phones,facultys);
           // objects.add(student); // i have commented the arrayList adding method
            hashMap.put(names,phones);
            //using HashSet
            hashSet.add(student);
            namefiled.setText("");
            facultyfield.setText("");
            phonefield.setText("");
             xy=xy+1;


        }
        if(e.getSource()==viewbtn)
        {
            for(int x=0; x<xy; x++)
            {
               // textArea.append(String.valueOf(objects.get(x))); // DISPLAYING WITH ARRAYLIST


                //System.out.println(""+objects.get(x));
            }
           // textArea.setText(student.toString());
           // Iterator<String>iterator=new hashSet.iterator();
            System.out.println(""+hashSet);

            textArea.append(String.valueOf(hashSet));    //

        }
        if(e.getSource()==cancelbtn)
        {
String namesearch = JOptionPane.showInputDialog("ENTER THE STUDENT NAME: ");
            textArea.append("\n"+String.valueOf(hashMap.get(namesearch))+"\n");

        }

    }
}
