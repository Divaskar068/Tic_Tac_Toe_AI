import java.util.*;
class ai
{
    public class num
    {
        int pmove,aimove;
        num(int p,int a)
        {
            pmove=p;
            aimove=a;
        }
        public int getp()
        {
            return pmove;
        }
        public int getai()
        {
            return aimove;
        }
        public void get()
        {
            System.out.println(pmove+" "+aimove);
        }
    }
static class move
    {
        int row,col;
    }
static char b[][] = {{ 'x', 'o', '_' },
                      { 'x', 'o', '_' },
                      { 'o', '_', 'x' }};
public static int i=1,j;
public static Iterator<Integer> itr;
public static Hashtable<Integer,String> g=new Hashtable<>();
public ArrayList<num> m=new ArrayList<>();
public static TreeMap<Integer,String> t;
public static num n;
static char p='x',com='o';
public static void game_tree(char p,char opp)
{
    g.put(50,"_ _ _\n_ _ _\n_ _ _");
    g.put(48,""+p+" _ _\n_ _ _\n_ _ _");
    g.put(45,"_ _ _\n_ "+p+" _\n_ _ _");
    g.put(46,""+p+" _ _\n_ "+opp+" _\n_ _ _");
    g.put(44,""+p+" _ "+opp+"\n_ _ _\n_ _ _");
    g.put(42,""+p+" "+opp+" _\n_ _ _\n_ _ _");
    g.put(35,""+opp+" _ _\n_ "+p+" _\n_ _ _");
    g.put(25,"_ "+opp+" _\n_ "+p+" _\n_ _ _");
    g.put(40,""+p+" _ _\n_ "+opp+" _\n_ _ "+p);
    g.put(38,""+p+" _ "+opp+"\n_ _ _\n"+p+" _ _");
    g.put(36,""+opp+" _ "+p+"\n_ "+p+" _\n_ _ _");
    g.put(34,"_ "+opp+" _\n_ "+p+" _\n"+p+" _ _");
    g.put(38,""+p+" _ _\n_ "+opp+" _\n"+opp+" _ "+p);
    g.put(37,""+p+" _ _\n"+opp+" "+opp+" _\n_ _ "+p);
    g.put(36,""+p+" "+opp+" "+opp+"\n_ _ _\n"+p+" _ _");
    g.put(35,""+p+" _ "+opp+"\n"+opp+" _ _\n"+p+" _ _");
    g.put(34,""+opp+" _ "+p+"\n_ "+p+" _\n"+opp+" _ _");
    g.put(33,""+opp+" _ "+p+"\n"+opp+" "+p+" _\n_ _ _");
    g.put(32,"_ "+opp+" "+opp+"\n_ "+p+" _\n"+p+" _ _");
    g.put(31,""+opp+" "+opp+" _\n_ "+p+" _\n"+p+" _ _");
    g.put(30,""+p+" _ "+p+"\n_ "+opp+" _\n"+opp+" _ "+p);
    g.put(29,""+p+" _ _\n"+opp+" "+opp+" "+p+"\n_ _ "+p);
    g.put(28,""+p+" "+opp+" "+opp+"\n"+p+" _ _\n"+p+" _ _");
    g.put(27,""+p+" _ "+opp+"\n"+opp+" _ _\n"+p+" _ "+p);
    g.put(26,""+opp+" _ "+p+"\n"+p+" "+p+" _\n"+opp+" _ _");
    g.put(24, ""+opp+"_ " +p+"\n" + opp + " " + p +" _\n" +p+" _ _");
    g.put(23,""+p+" "+opp + " " + opp + "\n_ "+p+" _\n"+""+p+" _ _");
    g.put(22,""+opp + " "+opp+" "+p+"\n_ "+p+" _\n"+""+p+" _ _");
    g.put(21,""+p+" "+opp+" "+p+"\n_ "+opp+" _\n"+opp+ " _ " + p);
    g.put(20,""+p+" _ _\n"+opp + " " + opp + " "+p+"\n"+opp + " _ "+p);
    g.put(19,""+p+" _ "+opp+"\n"+opp+" "+opp+" "+p + "\n_ _ "+p);
    g.put(18,""+p+" _ "+opp+"\n"+opp+" _ _\n"+p+" "+opp+" "+p);
    g.put(17,""+opp+" _ "+p+"\n"+p+" "+p+" _\n"+opp+ " "+opp+" _");
    g.put(16,""+opp+" _ "+p+"\n"+p+" "+p+" "+opp+"\n"+opp+ " _ _");
    g.put(15,""+p+" "+opp+" "+opp+"\n_ "+p+" _\n"+p+" _ "+opp);
    g.put(14,""+p+" "+opp+" "+p+"\n_ "+opp+" "+p+"\n"+opp+ " _ "+p);
    g.put(13,""+p+" _ "+p+"\n"+opp+ " "+opp+" "+p+"\n"+opp+" _ "+p);
    g.put(12,""+p+" _ "+opp+"\n"+opp+ " "+opp+" "+p+"\n"+p+" _ "+p);
    g.put(11,""+p+" _ "+opp+"\n" +opp+" "+p+" _\n"+p+" "+opp+" "+p);
    g.put(10,""+opp+" _ "+p+"\n"+p+" "+p+" "+p+"\n"+opp + " " +opp+" _");
    g.put(9,""+opp+" "+p+" "+p+"\n"+p+" "+p+" "+opp+"\n"+opp+" _ _");
    g.put(8,""+p+" "+opp+" "+opp+"\n"+p+" "+p+" _\n"+p+" _ "+opp);
    g.put(7,""+p+" _ "+opp+"\n"+opp+ " "+opp+" "+p+"\n"+p+" "+opp+" "+p);
    g.put(6,""+p+" "+opp+" "+opp+"\n"+opp+ " "+opp+" "+p+"\n"+p+" _ "+p);
    g.put(5,""+opp+" "+p+" "+p+"\n"+p+" "+p+" "+opp+"\n"+opp + " " +opp+" _");
    g.put(4,""+opp+" "+p+" "+p+"\n"+p+" "+p+" "+opp+"\n"+opp+" _ "+opp);
    g.put(3,""+p+" "+p+" "+opp+"\n"+opp+ " "+opp+" "+p+"\n"+p+" "+opp+" "+p);
    g.put(2,""+p+" "+opp+" "+opp+"\n"+opp+ " "+opp+" "+p+"\n"+p+" "+p+" "+p);
    g.put(1,""+opp+" "+p+" "+p+"\n"+p+" "+p+" "+opp+"\n"+opp+" "+opp+" "+p);
    g.put(0,""+opp+" "+p+" "+p+"\n"+p+" "+p+" "+opp+"\n"+opp+" "+p+" "+opp);
    //for (Map.Entry<Integer,String> e : g.entrySet())
        //System.out.print(e.getValue()+"\n\n");
}
public static void game_tree(String s)
{
    g.put(i,s);
    i++;
}
public static void display()
{
    t=new TreeMap<Integer,String>(g);
    Set<Integer> k=t.keySet();
    itr=k.iterator();
    
 System.out.println("Game states for this game are as follows\n");
 while(itr.hasNext())
 {
     int i=itr.next();
        System.out.print(i+"\n"+t.get(i)+"\n\n");
        
}
g.clear();
t.clear();
k.clear();

}
public void next_move()
{
    int i,j;
    for(i=1;i<=9;i++)
    {
        for(j=1;j<=9;j++)
    
        if(i==j)
    continue;
    else
        {
            n=new num(i,j);
            m.add(n);
   
        }
            }
    
}
public void make_next_move(int n,char pl,char ai)
{
    int k,l,p;
    int z,c = 0;
    boolean t;
    boolean u;
    boolean v;
    boolean w;
    boolean x;
    for(k=0;k<m.size();k++)
    {
       
        num n1=m.get(k);
        int i=n1.getp();
        if(n!=i)
            continue;
        else {
            z=0;
            int j=n1.getai();
            t=((tester.b[0][0]==pl&&tester.b[1][1]==pl)||(tester.b[1][0]==pl&&tester.b[2][0]==pl)||(tester.b[0][1]==pl&&tester.b[0][2]==pl)||(tester.b[1][1]==ai&&tester.b[2][2]==ai)||(tester.b[1][0]==ai&&tester.b[2][0]==ai)||(tester.b[0][1]==ai&&tester.b[0][2]==ai)||(tester.b[1][1]==pl&&tester.b[2][1]==pl)||(tester.b[0][0]==pl&&tester.b[0][2]==pl)||(tester.b[1][1]==ai&&tester.b[2][1]==ai)||(tester.b[0][0]==ai&&tester.b[0][2]==ai));
            u=((tester.b[1][1]==pl&&tester.b[2][0]==pl)||(tester.b[1][2]==pl&&tester.b[2][2]==pl)||(tester.b[0][0]==pl&&tester.b[0][1]==pl)||(tester.b[1][1]==ai&&tester.b[2][0]==ai)||(tester.b[1][2]==ai&&tester.b[2][2]==ai)||(tester.b[0][0]==ai&&tester.b[0][1]==ai)||(tester.b[1][1]==pl&&tester.b[1][2]==pl)||(tester.b[0][0]==pl&&tester.b[2][0]==pl)||(tester.b[1][1]==ai&&tester.b[1][2]==ai)||(tester.b[0][0]==ai&&tester.b[2][0]==ai));
            v=((tester.b[0][0]==pl&&tester.b[2][2]==pl)||(tester.b[0][1]==pl&&tester.b[2][1]==pl)||(tester.b[0][2]==pl&&tester.b[2][0]==pl)||(tester.b[1][0]==pl&&tester.b[1][2]==pl)||(tester.b[0][0]==ai&&tester.b[2][2]==ai)||(tester.b[0][1]==ai&&tester.b[2][1]==ai)||(tester.b[0][2]==ai&&tester.b[2][0]==ai)||(tester.b[1][0]==ai&&tester.b[1][2]==ai));
            w=((tester.b[0][2]==pl&&tester.b[2][2]==pl)||(tester.b[1][0]==pl&&tester.b[1][1]==pl)||(tester.b[0][2]==ai&&tester.b[2][2]==ai)||(tester.b[1][0]==ai&&tester.b[1][1]==ai)||(tester.b[0][0]==pl&&tester.b[1][0]==pl)||(tester.b[0][2]==pl&&tester.b[1][1]==pl)||(tester.b[2][1]==pl&&tester.b[2][2]==pl)||(tester.b[0][0]==ai&&tester.b[1][0]==ai)||(tester.b[0][2]==ai&&tester.b[1][1]==ai)||(tester.b[2][1]==ai&&tester.b[2][2]==ai));
            x=((tester.b[0][1]==pl&&tester.b[1][1]==pl)||(tester.b[2][0]==pl&&tester.b[2][2]==pl)||(tester.b[0][1]==ai&&tester.b[1][1]==ai)||(tester.b[2][0]==ai&&tester.b[2][2]==ai)||(tester.b[0][0]==pl&&tester.b[1][1]==pl)||(tester.b[2][0]==pl&&tester.b[2][1]==pl)||(tester.b[0][2]==pl&&tester.b[1][2]==pl)||(tester.b[0][0]==ai&&tester.b[1][1]==ai)||(tester.b[2][0]==ai&&tester.b[2][1]==ai)||(tester.b[0][2]==ai&&tester.b[1][2]==ai));
            if(t||u||v||w||x)
            {
            if((j==1&&tester.b[0][0]=='_')&&((tester.b[1][1]==pl&&tester.b[2][2]==pl)||(tester.b[1][0]==pl&&tester.b[2][0]==pl)||(tester.b[0][1]==pl&&tester.b[0][2]==pl)))
            {
                tester.b[0][0]=ai;
                z=1;
                break; 
                
            }
            if(z==1)
                break;
            if((j==1&&tester.b[0][0]=='_')&&((tester.b[1][1]==ai&&tester.b[2][2]==ai)||(tester.b[1][0]==ai&&tester.b[2][0]==ai)||(tester.b[0][1]==ai&&tester.b[0][2]==ai)))
            {
                tester.b[0][0]=ai;
                z=1;
                break; 
                
            }
            if(z==1)
                break;
            if((j==2&&tester.b[0][1]=='_')&&((tester.b[1][1]==pl&&tester.b[2][1]==pl)||(tester.b[0][0]==pl&&tester.b[0][2]==pl)))
            {
                tester.b[0][1]=ai;
                z=1;
               
                break;
            }
            if(z==1)
                break;
            if((j==2&&tester.b[0][1]=='_')&&((tester.b[1][1]==ai&&tester.b[2][1]==ai)||(tester.b[0][0]==ai&&tester.b[0][2]==ai)))
            {
                tester.b[0][1]=ai;
                z=1;
               
                break;
            }
            if(z==1)
                break;
            if((j==3&&tester.b[0][2]=='_')&&((tester.b[1][1]==pl&&tester.b[2][0]==pl)||(tester.b[1][2]==pl&&tester.b[2][2]==pl)||(tester.b[0][0]==pl&&tester.b[0][1]==pl)))
            {
                tester.b[0][2]=ai;
                z=1;
                break;
            }
            if(z==1)
                break;
            if((j==3&&tester.b[0][2]=='_')&&((tester.b[1][1]==ai&&tester.b[2][0]==ai)||(tester.b[1][2]==ai&&tester.b[2][2]==ai)||(tester.b[0][0]==ai&&tester.b[0][1]==ai)))
            {
                tester.b[0][2]=ai;
                z=1;
                break;
            }
            if(z==1)
                break;
            if((j==4&&tester.b[1][0]=='_')&&((tester.b[1][1]==pl&&tester.b[1][2]==pl)||(tester.b[0][0]==pl&&tester.b[2][0]==pl)))
            {
                tester.b[1][0]=ai;
                z=1;
                break;
              
                
            }
            if(z==1)
                break;
            if((j==4&&tester.b[1][0]=='_')&&((tester.b[1][1]==ai&&tester.b[1][2]==ai)||(tester.b[0][0]==ai&&tester.b[2][0]==ai)))
            {
                tester.b[1][0]=ai;
                z=1;
                break;
              
                
            }
            if(z==1)
                break;
            if((j==5&&tester.b[1][1]=='_')&&((tester.b[0][0]==pl&&tester.b[2][2]==pl)||(tester.b[0][1]==pl&&tester.b[2][1]==pl)||(tester.b[0][2]==pl&&tester.b[2][0]==pl)||(tester.b[1][0]==pl&&tester.b[1][2]==pl)))
            {
                tester.b[1][1]=ai;
                z=1;
                
                break;
                
            }
            if(z==1)
                break;
            if((j==5&&tester.b[1][1]=='_')&&((tester.b[0][0]==ai&&tester.b[2][2]==ai)||(tester.b[0][1]==ai&&tester.b[2][1]==ai)||(tester.b[0][2]==ai&&tester.b[2][0]==ai)||(tester.b[1][0]==ai&&tester.b[1][2]==ai)))
            {
                tester.b[1][1]=ai;
                z=1;
                
                break;
                
            }
            if(z==1)
                break;
            if((j==6&&tester.b[1][2]=='_')&&((tester.b[0][2]==pl&&tester.b[2][2]==pl)||(tester.b[1][0]==pl&&tester.b[1][1]==pl)))
            {
                tester.b[1][2]=ai;
                z=1;
                break;
                
            }
            if(z==1)
                break;
            if((j==6&&tester.b[1][2]=='_')&&((tester.b[0][2]==ai&&tester.b[2][2]==ai)||(tester.b[1][0]==ai&&tester.b[1][1]==ai)))
            {
                tester.b[1][2]=ai;
                z=1;
                break;
                
            }
            if(z==1)
                break;
            if((j==7&&tester.b[2][0]=='_')&&((tester.b[0][0]==pl&&tester.b[1][0]==pl)||(tester.b[0][2]==pl&&tester.b[1][1]==pl)||(tester.b[2][1]==pl&&tester.b[2][2]==pl)))
            {
                tester.b[2][0]=ai;
                z=1;
                break;
                
            }
            if(z==1)
                break;
            if((j==7&&tester.b[2][0]=='_')&&((tester.b[0][0]==ai&&tester.b[1][0]==ai)||(tester.b[0][2]==ai&&tester.b[1][1]==ai)||(tester.b[2][1]==ai&&tester.b[2][2]==ai)))
            {
                tester.b[2][0]=ai;
                z=1;
                break;
                
            }
            if(z==1)
                break;
            if((j==8&&tester.b[2][1]=='_')&&((tester.b[0][1]==pl&&tester.b[1][1]==pl)||(tester.b[2][0]==pl&&tester.b[2][2]==pl)))
            {
                tester.b[2][1]=ai;
                z=1;
                break;
                
            }
            if(z==1)
                break;
            if((j==8&&tester.b[2][1]=='_')&&((tester.b[0][1]==ai&&tester.b[1][1]==ai)||(tester.b[2][0]==ai&&tester.b[2][2]==ai)))
            {
                tester.b[2][1]=ai;
                z=1;
                break;
                
            }
            if(z==1)
                break;
            if((j==9&&tester.b[2][2]=='_')&&((tester.b[0][0]==pl&&tester.b[1][1]==pl)||(tester.b[2][0]==pl&&tester.b[2][1]==pl)||(tester.b[0][2]==pl&&tester.b[1][2]==pl)))
            {
                tester.b[2][2]=ai;
                z=1;
                break;
                
            }
            if(z==1)
                break;
            if((j==9&&tester.b[2][2]=='_')&&((tester.b[0][0]==ai&&tester.b[1][1]==ai)||(tester.b[2][0]==ai&&tester.b[2][1]==ai)||(tester.b[0][2]==ai&&tester.b[1][2]==ai)))
            {
                tester.b[2][2]=ai;
                z=1;
                break;
                
            }
            if(z==1)
                break;
            }
            else
            {
            
                if(j==1&&tester.b[0][0]=='_'&&z==0)
                {
                    tester.b[0][0]=ai;
                    z=1;
                    break;
                }
                if(z==1)
                    break;
                
                if(j==2&&tester.b[0][1]=='_'&&z==0)
                {
                    tester.b[0][1]=ai;
                    z=1;
                    break;
                }
                if(z==1)
                    break;
                if(j==3&&tester.b[0][2]=='_'&&z==0)
                {
                    tester.b[0][2]=ai;
                    z=1;
                    break;
                }
                if(z==1)
                    break;
                if(j==4&&tester.b[1][0]=='_'&&z==0)
                {
                    tester.b[1][0]=ai;
                    z=1;
                    break;
                }
                if(z==1)
                    break;
                if(j==5&&tester.b[1][1]=='_'&&z==0)
                {
                    tester.b[1][1]=ai;
                    z=1;
                    break;
                }
                if(z==1)
                    break;
                if(j==6&&tester.b[1][2]=='_'&&z==0)
                {
                    tester.b[1][2]=ai;
                    z=1;
                    break;
                }
                if(z==1)
                    break;
                if(j==7&&tester.b[2][0]=='_'&&z==0)
                {
                    tester.b[2][0]=ai;
                    z=1;
                    break;
                }
                if(z==1)
                    break;
                if(j==8&&tester.b[2][1]=='_'&&z==0)
                {
                    tester.b[2][1]=ai;
                    z=1;
                    break;
                }
                if(z==1)
                    break;
                if(j==9&&tester.b[2][2]=='_'&&z==0)
                {
                    tester.b[2][2]=ai;
                    z=1;
                    break;
                }
                if(z==1)
                    break;
            }
        }
        
    }
}
public static boolean isthere(String s)
{
    for (Map.Entry<Integer,String> e : g.entrySet())
        if(s.equals(e.getValue()))
            return true;
    return false;
}
public static void game_state(String s)
{
    for (Map.Entry<Integer,String> e : g.entrySet())
        if(s.equals(e.getValue()))
           System.out.println("yes");
}
    /*static int eval(char p)
    {
        for(int i=0;i<3;i++)
        {
            if(b[i][0]==b[i][1]&&b[i][1]==b[i][2])
            {
                if(b[i][0]==p)
                return 10;
                else if(b[i][0]==com) 
                return -10;
            }
        }
        for(int i=0;i<3;i++)
        {
            if(b[0][i]==b[1][i]&&b[1][i]==b[2][i])
            {
                if(b[0][i]==p)
                return 10;
                else if(b[i][0]==com)
                return -10;
            }
        }
        if(b[0][0]==b[1][1]&&b[1][1]==b[2][2])
        {
            if(b[0][0]==p)
            return 10;
            else if(b[0][0]==com)
            return -10;
        }
        if(b[0][2]==b[1][1]&&b[1][1]==b[2][0])
        {
            if(b[0][2]==p)
            return 10;
            else if(b[0][2]==com)
            return -10;
        }
        return 0;
    }
    static Boolean movesthere()
{
    for (int i = 0; i < 3; i++)
        for (int j = 0; j < 3; j++)
            if (b[i][j] == '_')
                return true;
    return false;
}*/
   /*static int minimax(char player,Boolean imax)
   {
       int score=eval(player);
if(score==10)
return score;
else if(score==-10)
return score;
       if(movesthere()==false)
       return 0;
       int best;
       if(imax)
       {
           best=-1000;
           for(int i=0;i<3;i++)
           for(int j=0;j<3;j++)
            if(b[i][j]=='_')
               {
                   b[i][j]=p;
                   best=Math.max(best,minimax(player,!imax));
                   b[i][j]='_';
               }
           return best;
       }
       else
       {
           best=1000;
           for(int i=0;i<3;i++)
           for(int j=0;j<3;j++)
           if(b[i][j]=='_')
           {
               b[i][j]=com;
               best=Math.min(best,minimax(player,!imax));
               b[i][j]='_';
           }
           return best; 
       }
      
   }
   static void bestmove(char player)
   {
       int bestvalue=-1000;
       move bestMove=new move();
       bestMove.row=bestMove.col=-1;
if(player==p){
       for(int i=0;i<3;i++)
       for(int j=0;j<3;j++)
       {
           if(b[i][j]=='_')
           {
               b[i][j]=p;
               int m=minimax(player,false);
               b[i][j]='_';
               if(m>bestvalue)
           	{
                   bestMove.row=i;
                   bestMove.col=j;
                   bestvalue=m;
               }
           }}}
System.out.println("Value of move : "+bestvalue);
       System.out.println("Best move is Row "+(bestMove.row+1)+" and column "+(bestMove.col+1));
   }*/
   public static void main(String[] args)
{   
 //bestmove(p);
 
 /*String s=Arrays.deepToString(b).replace("], ","\n");
 s=s.replace("[[","");
 s=s.replace("]]", "");
 s=s.replace("[", "");
 s=s.replace(", "," ");*/
 //game_tree(p,com);
}}