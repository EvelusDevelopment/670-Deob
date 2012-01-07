import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

final class rr extends rp implements MouseListener, MouseMotionListener, MouseWheelListener {

   static int E;
   static int m;
   static int p;
   static int q;
   static int I;
   static int y;
   private int J;
   static int K;
   static int z;
   static int C;
   static int h;
   static int o;
   static int t;
   static int f_l;
   private int G;
   static int F;
   static int u;
   static int N;
   static int f_i;
   static int x;
   static int A;
   static int g;
   static int r;
   static int n;
   static int v;
   private int M;
   private Object[] H = ura.a(-111, new Object[2]);
   static int B;
   static int D;
   private Object[] s = ura.a(-81, new Object[2]);
   private int f;
   private int k;
   private int L;
   private Component j;
   private boolean w;


   static final void a(ka var0, int var1, int var2, int var3, Object[] var4, int var5) {
      if(var3 != 2) {
         ((int[])((int[])var4[1]))[23] = ((int[])((int[])((Object[])((Object[])var4[20]))[1]))[3];
      }

      ++o;
      if(null != var0) {
         fj.a(var0.da(), var0.D(), var5, var1, var0.RA(), var4, var0.N(), var0.LA(), var0.MA(), var2, 36, var0.pa());
      }
   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      this.a(true, var1.getY(), var1.getX());
      ++q;
   }

   private final void a(int var1, int var2, int var3, int var4, int var5) {
      ++F;
      Object[] var8 = new Object[3];
      if(var8[2] == null) {
         var8[2] = new long[1];
      }

      if(var8[1] == null) {
         var8[1] = new int[4];
      }

      uia.a(-13, var8);
      ((int[])((int[])var8[1]))[0] = var2;
      ((int[])((int[])var8[1]))[3] = var3;
      ((int[])((int[])var8[1]))[2] = var5;
      if(var8 != null && var8.length == 1) {
         this.w = ((boolean[])((boolean[])this.H[11]))[0];
      }

      ((long[])((long[])var8[2]))[0] = he.a(-39);
      ((int[])((int[])var8[1]))[1] = var1;
      Object[] var6;
      client.a(111, this.s, (lm)(null != (var6 = var8)?var6[0]:null));
      if(var4 >= -67) {
         ((long[])((long[])((Object[])((Object[])((Object[])((Object[])this.H[3]))[0]))[0]))[13] = 36L;
      }

   }

   public final synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      ++r;
      int var2 = var1.getX();
      int var3 = var1.getY();
      int var4 = var1.getWheelRotation();
      this.a(var4, 6, var2, -72, var3);
      var1.consume();
   }

   final int e(int var1) {
      if(var1 != 18677) {
         this.s = (Object[])((Object[])this.H[9]);
      }

      ++A;
      return this.G;
   }

   final Object[] c(byte var1) {
      ++m;
      if(var1 > -30) {
         this.j = (Component)null;
      }

      bc var2;
      return null == (var2 = (bc)jca.b((byte)69, this.H))?null:var2.m;
   }

   public final synchronized void mouseExited(MouseEvent var1) {
      ++h;
      this.a(true, var1.getY(), var1.getX());
   }

   final boolean c(int var1) {
      if(var1 != -15864) {
         this.M = 69;
      }

      ++D;
      return (this.J & 2) != 0;
   }

   private final int a(int var1, MouseEvent var2) {
      ++B;
      return var2.getButton() == 1?(!var2.isMetaDown()?1:4):(var1 != ~var2.getButton()?(var2.getButton() == 3?4:0):2);
   }

   public final synchronized void mouseClicked(MouseEvent var1) {
      ++n;
      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   final void b(byte var1) {
      if(var1 > -50) {
         this.mouseEntered((MouseEvent)null);
      }

      ++K;
      this.d((byte)46);
   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      ++f_i;
      int var2 = this.a(-3, var1);
      if(0 == (this.L & var2)) {
         var2 = this.L;
      }

      if(-1 != ~(var2 & 1)) {
         this.a(var1.getClickCount(), 3, var1.getX(), -124, var1.getY());
      }

      if(0 != (var2 & 4)) {
         this.a(var1.getClickCount(), 5, var1.getX(), -89, var1.getY());
      }

      if(0 != (var2 & 2)) {
         this.a(var1.getClickCount(), 4, var1.getX(), -120, var1.getY());
      }

      this.L &= ~var2;
      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   static final int a(boolean var0, Object[] var1) {
      ++f_l;
      if(var1 != null && var1.length == 43 && ((byte[])((byte[])var1[10])).length == 8) {
         return fba.a((byte)28, var1);
      } else if(var0) {
         return 97;
      } else if(null != var1 && -44 == ~var1.length && -59 == ~((int[])((int[])var1[12])).length) {
         byte var2 = -1;
         return var2;
      } else {
         throw new IllegalStateException();
      }
   }

   public final synchronized void mouseEntered(MouseEvent var1) {
      ++C;
      this.a(true, var1.getY(), var1.getX());
   }

   static final void a(ta var0, int[][][] var1, int var2, Object[] var3, Object[][] var4) {
      ++E;
      int var5;
      int var6;
      int var7;
      if(!((boolean[])((boolean[])var3[3]))[var2]) {
         for(var5 = 0; var5 < 4; ++var5) {
            for(var6 = 0; ((int[])((int[])var3[1]))[0] > var6; ++var6) {
               if(var3 != null && (-3 == ~var3.length && var3[1].equals(Integer.valueOf(1)) || -9 == ~var3.length && var3[0].equals(Integer.valueOf(1)) && var3[0].equals(Integer.valueOf(2)) || var3.length == 9 && var3[7].equals(Integer.valueOf(0)))) {
                  ng.a((ta)null, (int)13, (Object[])null);
               }

               for(var7 = 0; var7 < ((int[])((int[])var3[1]))[2]; ++var7) {
                  if(-1 != ~(pd.b[var5][var6][var7] & 1)) {
                     int var8 = var5;
                     if((2 & pd.b[1][var6][var7]) != 0) {
                        var8 = var5 - 1;
                     }

                     if(var8 >= 0) {
                        Object[] var9 = var4[var8];
                        int var10 = var6 - ((int[])((int[])var9[1]))[2];
                        int var11 = var7 - ((int[])((int[])var9[1]))[0];
                        ((int[][])((int[][])var9[0]))[var10][var11] |= 2097152;
                     }
                  }
               }
            }
         }

         if(null != var3 && var3.length == 10) {
            dia.a((Object[])null, var2 ^ -113);
         }
      }

      for(var5 = 0; var5 < ((int[])((int[])var3[1]))[1]; ++var5) {
         var6 = 0;
         var7 = 0;
         if(!((boolean[])((boolean[])var3[3]))[0]) {
            if(rd.m) {
               var7 |= 8;
            }

            if(nra.d) {
               var6 |= 2;
            }

            if(nua.e != 0) {
               if(0 == var5 | uk.d) {
                  var7 |= 16;
               }

               var6 |= 1;
            }
         }

         if(nra.d) {
            var7 |= 7;
         }

         if(!eva.a) {
            var7 |= 32;
         }

         int[][] var13 = (int[][])(null != var1 && var5 < var1.length?var1[var5]:((Object[])((Object[])var3[4]))[var5]);
         eb.a(var5, var0.a(((int[])((int[])var3[1]))[0], ((int[])((int[])var3[1]))[2], ((int[][][])((int[][][])var3[4]))[var5], var13, 512, var6, var7));
      }

      if(null != var3 && (var3.length == 32 && var3[6].equals(Integer.valueOf(2)) && var3[6].equals(Integer.valueOf(2)) || -7 == ~var3.length)) {
         rf.a((aa)null, (int[][])null, (aa)null, (ta)null, (aa)null, 38, 9, (Object[])null);
      }

   }

   final int d(int var1) {
      ++u;
      if(var1 != 104) {
         a(false, (Object[])null);
      }

      return this.M;
   }

   private final void a(boolean var1, int var2, int var3) {
      this.k = var2;
      this.f = var3;
      ++g;
      if(var1) {
         if(this.w) {
            this.a(0, -1, var3, -72, var2);
         }

      }
   }

   private final void d(byte var1) {
      ++p;
      if(this.j != null) {
         this.j.removeMouseWheelListener(this);
         this.j.removeMouseMotionListener(this);
         this.j.removeMouseListener(this);
         this.s = null;
         this.f = 0;
         if(var1 == 46) {
            this.J = 0;
            this.k = 0;
            this.L = 0;
            this.G = 0;
            this.H = null;
            this.M = 0;
            this.j = null;
         }
      }
   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      this.a(true, var1.getY(), var1.getX());
      ++I;
   }

   static final boolean a(int var0, int var1, int var2) {
      if(var2 != 0) {
         return true;
      } else {
         ++N;
         return (24 & var0) != 0 | 544 == (var0 & 544);
      }
   }

   final boolean a(byte var1) {
      if(var1 > -125) {
         return ((boolean[])((boolean[])this.s[2]))[1];
      } else {
         ++t;
         return (4 & this.J) != 0;
      }
   }

   final boolean b(int var1) {
      if(var1 != 104) {
         a((ta)null, (int[][][])((int[][][])((Object[])((Object[])((Object[])((Object[])this.H[1]))[31]))[2]), ((int[])((int[])((Object[])((Object[])((Object[])((Object[])this.H[2]))[7]))[1]))[1], (Object[])null, (Object[][])((Object[][])null));
      }

      ++x;
      return (this.J & 1) != 0;
   }

   final synchronized void a(int var1) {
      this.J = this.L;
      this.G = this.k;
      if(var1 != 104) {
         this.mouseClicked((MouseEvent)null);
      }

      ++y;
      this.M = this.f;
      Object[] var2 = this.H;
      this.H = this.s;
      this.s = var2;
      nb.b(this.s, var1 - 104);
   }

   public final synchronized void mousePressed(MouseEvent var1) {
      ++v;
      int var2 = this.a(-3, var1);
      if(1 == var2) {
         this.a(var1.getClickCount(), 0, var1.getX(), -125, var1.getY());
      } else if(4 != var2) {
         if(2 == var2) {
            this.a(var1.getClickCount(), 1, var1.getX(), -116, var1.getY());
         }
      } else {
         this.a(var1.getClickCount(), 2, var1.getX(), -92, var1.getY());
      }

      this.L |= var2;
      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   private final void a(int var1, Component var2) {
      ++z;
      this.d((byte)46);
      this.j = var2;
      this.j.addMouseListener(this);
      this.j.addMouseMotionListener(this);
      this.j.addMouseWheelListener(this);
      if(var1 != 2) {
         this.s = (Object[])null;
      }

   }

   rr(Component var1, boolean var2) {
      this.a(2, var1);
      this.w = var2;
   }

}
