package text.bwei.com.lianxi4;


/**
 * 1.version:有道云笔记十道Java算法题http://note.youdao.com/share/?id=9c88ca5eac799500e6a92b81364f653e&type=note#/
 * 2.date:2016/11/30 11:36
 * 3.update:2016/11/30.
 * 4.autour:张玉杰
 */
public class Jicheng {


    /** //1、题目：遍历出一个文件夹下的所有文件，并展示出层级关系，文件夹优先显示，最后以一定格式写入文本中*/

    //解决方案

    /*private static ArrayList<String> filelist = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        String filePath = "G://wenjian";
        getFiles(filePath);
    }

    //通过递归得到某一路径下所有的目录及其文件
    static void getFiles(String filePath) {
        File root = new File(filePath);
        File[] files = root.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                //递归调用
                getFiles(file.getAbsolutePath());
                filelist.add(file.getAbsolutePath());
                System.out.println("显示" + filePath + "下所有子目录及其文件" + file.getAbsolutePath());
            } else {
                System.out.println("显示" + filePath + "下所有子目录" + file.getAbsolutePath());
            }
        }
    }*/


    /** //2、题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。*/

    /*public static void main(String[] args) {
        int i;
        int LetterCount = 0;
        int SpaceCount = 0;
        int NumberCount = 0;
        int OtherCount = 0;

        //输入一个字符串
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = in.nextLine();

        //字符串转换成字符数组
        char[] ch = str.toCharArray();
        for (i = 0; i < str.length(); i++) {
            if (Character.isLetter(ch[i])) {
                LetterCount++;
            } else if (Character.isSpaceChar(ch[i])) {
                SpaceCount++;
            } else if (Character.isDigit(ch[i])) {
                NumberCount++;
            } else {
                OtherCount++;
            }
        }

        System.out.println("字符的个数为:" + LetterCount);
        System.out.println("空格的个数为:" + SpaceCount);
        System.out.println("数字的个数为:" + NumberCount);
        System.out.println("其他字符个数为:" + OtherCount);
    }*/

    /** //3、题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？*/

    //解决方案
    /*public static void main(String[] args) {
        long s1, s2;// 定义这个月和下个月兔子的数量
        s1 = 1;  //第一个月为1对
        s2 = 1;  //第二个月为1对
        int i = 1;  //定义一个控制变量
        int m;  // 月份数
        Scanner in = new Scanner(System.in); //从控制台输入想要查看的月份
        System.out.println("请输入你想要查看的月数:");//输入提示
        m = in.nextInt();//输入的整数月份赋值给m
        //while循环
        while (true) {
            //第一个月和第二个月兔子的数量都为1对
            if (i == 1 || i == 2) {
                System.out.println(i + " month: " + s1);
                i++; // 控制变量 i 加1
            }
            // i 大于3并且小于我们需要查看的月份
            else if (i < m) {
                s1 = s1 + s2;
                s2 = s1 + s2;
                System.out.println(i + " month: " + s1);
                i++;//月份加1
                System.out.println(i + " month: " + s2);
                i++; //朋份加1
            } else {
                break;//不符合条件就退出
            }

        }
    }*/


    /** //4、题目：有1,2,3,4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？*/


    //解决方案
    /*public static void main(String[] args) {
        int n = 0;
        for (int i = 1; i <= 4; ++i)
            for (int j = 1; j <= 4; ++j)
                for (int k = 1; k <= 4; ++k)
                    if (i != j && j != k && i != k && ++n != 0)
                        System.out.println("NO." + n + ":" + i + "" + j + "" + k);
        System.out.println("共有:" + n + "种");
    }*/


    /**5、题目：求1+2!+3!+...+20!的和*/

    //解决方案
    /*int f(int n) {
        int t = 0;
        int s = 1;
        for (int i = 1; i <= n; i++) {
            s = s * i;
            t = t + s;
        }
        return t;
    }

    public static void main(String[] args) {
        int m = 20;//改变这个m的值即可改变输出结果
        Jicheng p = new Jicheng();
        if (m >= 0) {
            System.out.println(p.f(m));
        } else {
            System.out.println("请输入一个大于0的数");
        }
    }*/

    /**6、题目：5位数中找出所有，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同*/


    //解决方案
    /*static int[] a = new int[5];
    static int[] b = new int[5];

    public static void main(String[] args) {
        boolean is = false;
        Scanner s = new Scanner(System.in);
        long l = s.nextLong();
        if (l > 99999 || l < 10000) {
            System.out.println("Input error, please input again!");
            l = s.nextLong();
        }
        for (int i = 4; i >= 0; i--) {
            a[i] = (int) (l / (long) Math.pow(10, i));
            l = (l % (long) Math.pow(10, i));
        }
        System.out.println();
        for (int i = 0, j = 0; i < 5; i++, j++) {
            b[j] = a[i];
        }
        for (int i = 0, j = 4; i < 5; i++, j--) {
            if (a[i] != b[j]) {
                is = false;
                break;
            } else {
                is = true;
            }
        }
        if (is == false) {
            System.out.println("这个不是回文数！");
        } else if (is == true) {
            System.out.println("这个就是回文数！");
        }
    }*/
    /** //7、题目：打印出杨辉三角形（要求打印出10行以上）*/


    //解决方案
    /*public static void main(String args[]) {
        int i, j;
        int a[][];
        a = new int[11][11];
        for (i = 0; i < 11; i++) {
            a[i][i] = 1;
            a[i][0] = 1;
        }
        for (i = 2; i < 11; i++) {
            for (j = 1; j <= i - 1; j++) {
                a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
            }
        }
        for (i = 0; i < 11; i++) {
            for (j = 0; j < i; j++) {
                System.out.printf("  " + a[i][j]);
            }
            System.out.println();
        }
    }*/

    /**8、题目：计算字符串中子串出现的次数*/


    //解决方案
   /* public static void main(String[] args) {
        String str = "abcdefabhjlecababcab";
        String str1 = "ab";
        int count = 0;
        int start = 0;
        while (str.indexOf(str1, start) >= 0 && start < str.length()) {
            count++;
            start = str.indexOf(str1, start) + str1.length();
        }
        System.out.println(str1 + "在" + str + "出现的次数为" + count);
    }*/

    /**9、题目：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。*/


    //解决方案
    /*public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("请输入总人数：");
        int p = input.nextInt();
        //初始化人员
        boolean[] per = new boolean[p];// boolean数组表示站成一圈的人，false表示退出
        for (int i = 0; i < per.length; i++) {
            per[i] = true;
        }

        //报号
        int t = 0, len = per.length;
        while (len > 1) {
            for (int i = 0; i < per.length; i++) {

                if (per[i]) {
                    t++;
                    if (t == 3) {
                        t = 0;
                        per[i] = false;
                        len--;
                    }
                }
            }
        }
        //结果
        System.out.println("最后的情况：" + Arrays.toString(per));
        for (int i = 0; i < per.length; i++) {
            if (per[i]) {
                System.out.println("原来喊的数：" + (i + 1) % 3);
            }
        }
    }*/

    /**10、题目：求100之内的素数    //使用除sqrt(n)的方法求出的素数不包括2和3*/


    //解决方案
    /*public static void main(String[] args) {
        boolean b = false;
        System.out.print(2 + "");
        System.out.print(3 + "");
        for (int i = 3; i < 100; i += 2) {
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                } else {
                    b = true;
                }
            }
            if (b = true) {
                System.out.print(i + "  ");
            }
        }
    }*/

}
