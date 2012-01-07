import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;

abstract class gi extends Applet implements Runnable, FocusListener, WindowListener {

   static int q;
   static int M;
   static int f_i;
   static int y;
   static int X;
   static int m;
   static int e;
   static int f_l;
   static int K;
   static int J;
   static int a;
   static int W;
   static int k;
   static int v;
   static Object[] g = st.a(new Object[1], 7, 50, 21);
   static int Y;
   static int R;
   static int A;
   static int L;
   private static int c = 500;
   private boolean D = false;
   static int C;
   static int U;
   static int T;
   static int O;
   static int H;
   static int B;
   static int p;
   static int b;
   static byte[][] S;
   static int E;
   private boolean u = false;
   static int I;
   static int o;
   static int t;
   static int n;
   static int V;
   static int F;
   static int x;
   static int r;
   static int G;
   static int d;
   static int f;
   static int Q;
   static int j = 0;
   static int h;
   static int s;
   static int N;
   static int w;
   static int z;
   static int P;


   abstract void d(int var1);

   public final void focusGained(FocusEvent var1) {
      ++p;
      dka.b = true;
      ofa.c = true;
   }

   final boolean a(int var1, File var2) {
      ++b;
      if(null != var2) {
         if(!var2.exists()) {
            return false;
         } else if(!var2.isDirectory()) {
            return false;
         } else if(var2.listFiles().length != 0) {
            return false;
         } else if(!this.a(true, (int)26662, new File(var2, "test.dat"))) {
            return false;
         } else {
            int var3 = 122 / ((var1 + 86) / 40);
            this.a(true, var2, av.c);
            return true;
         }
      } else {
         return false;
      }
   }

   public final void windowIconified(WindowEvent var1) {
      ++F;
   }

   private final void a(boolean var1, byte var2, Object[] var3) {
      ++M;
      if(var3 == null) {
         throw new NullPointerException();
      } else if(var3 != jb.b && kl.f != var3) {
         throw new IllegalStateException();
      } else {
         pha.e = var3;
         if(pha.e != kl.f) {
            if(var1) {
               pha.e = ada.a;
            }

            if(var2 < 94) {
               g = new Object[4];
            }

         }
      }
   }

   public final void focusLost(FocusEvent var1) {
      ++W;
      dka.b = false;
   }

   public final void windowDeiconified(WindowEvent var1) {
      ++L;
   }

   private final void a(boolean var1, File var2, File var3) {
      ++o;

      try {
         Object[] var4 = es.a(new Object[3], 10000L, "rw", (byte)-36, qd.b);
         Object[] var5 = hi.newByteBufferWrapper(500);
         ek.putByte(var5, 2);
         ek.putByte(var5, null != var3?1:0);
         if(!var1) {
            c = 117;
         }

         mpa.a(var5, (byte)0, var2.getPath());
         if(var3 != null) {
            mpa.a(var5, (byte)0, var3.getPath());
         }

         mr.a(0, var4, 19444, (byte[])((byte[])var5[2]), ((int[])((int[])var5[1]))[0]);
         it.a(var4, !var1);
      } catch (IOException var6) {
         var6.printStackTrace();
      }

   }

   public final void start() {
      ++I;
      if(!ira.g) {
         hk.e = 0L;
      }
   }

   private final synchronized void a(int var1, String var2) {
      opa.g = new Frame();
      ++N;
      opa.g.setTitle(var2);
      opa.g.setResizable(true);
      if(var1 != 0) {
         this.windowIconified((WindowEvent)null);
      }

      opa.g.addWindowListener(this);
      opa.g.setBackground(Color.black);
      opa.g.setVisible(true);
      opa.g.toFront();
      Insets var3 = opa.g.getInsets();
      opa.g.setSize(rp.a + var3.left + var3.right, var3.bottom + jma.h + var3.top);
   }

   private final void a(boolean var1, boolean var2) {
      ++G;
      synchronized(this) {
         if(ira.g) {
            return;
         }

         ira.g = var1;
      }

      try {
         this.d((int)28);
      } catch (Exception var7) {
         ;
      }

      try {
         cda.a(1, nu.a);

         for(int var3 = 0; var3 < foa.d; ++var3) {
            cda.a(1, rb.a[var3]);
         }

         cda.a(1, wn.b);
         cda.a(1, cj.d);
      } catch (Exception var8) {
         ;
      }

      if(this.D) {
         try {
            jagmisc.quit();
         } catch (Throwable var6) {
            ;
         }

         this.D = false;
      }

      lla.a(true, (byte)72);
      ww.b((byte)-85);
      if(null != ru.d) {
         try {
            ru.d.removeFocusListener(this);
            ru.d.getParent().remove(ru.d);
         } catch (Exception var5) {
            ;
         }
      }

      if(null != opa.g) {
         opa.g.setVisible(false);
         opa.g.dispose();
         opa.g = null;
      }

   }

   public final void update(Graphics var1) {
      this.paint(var1);
      ++f_i;
   }

   final boolean f(int var1) {
      ++C;
      String var2 = this.getDocumentBase().getHost().toLowerCase();
      if(!var2.equals("jagex.com") && !var2.endsWith(".jagex.com")) {
         if(!var2.equals("runescape.com") && !var2.endsWith(".runescape.com")) {
            if(!var2.equals("stellardawn.com") && !var2.endsWith(".stellardawn.com")) {
               int var3 = 34 % ((var1 - 50) / 39);
               if(var2.endsWith("127.0.0.1")) {
                  return true;
               } else {
                  while(var2.length() > 0 && 48 <= var2.charAt(-1 + var2.length()) && 57 >= var2.charAt(-1 + var2.length())) {
                     var2 = var2.substring(0, -1 + var2.length());
                  }

                  if(!var2.endsWith("192.168.1.")) {
                     this.a("invalidhost", (byte)67);
                     return false;
                  } else {
                     return true;
                  }
               }
            } else {
               return true;
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   static final void a(int var0, Object[] var1) {
      ++R;
      int var3 = -79 % ((var0 - 12) / 51);
      Object[] var2 = bg.h;
      Object[] var4 = (Object[])((Object[])((Object[])((Object[])var1[0]))[42]);
      aqa.a(true, var2, var4);
      int var5 = qr.a(true, (Object[])((Object[])var1[17]));
      if(var1[9] != null) {
         vla.a((Object[])((Object[])var1[9]), true, var4, (Object[])((Object[])var1[17]));
         ((int[])((int[])var1[7]))[var5] &= -2;
      }

      if(null != var1[12]) {
         jt.a(mua.a((Object[])((Object[])var1[0]), (byte)-61), var4, 2, ni.v);
         vla.a((Object[])((Object[])var1[12]), true, ni.v, (Object[])((Object[])var1[17]));
         ((int[])((int[])var1[7]))[var5] &= -17;
      }

      if(null != var1[10]) {
         jt.a(iia.a((byte)89, (Object[])((Object[])var1[0])), var4, 2, ni.v);
         vla.a((Object[])((Object[])var1[10]), true, ni.v, (Object[])((Object[])var1[17]));
         ((int[])((int[])var1[7]))[var5] &= -33;
      }

      maa.a(var1, var2, var5, 13);
      if(null != var1[15]) {
         float[] var6 = new float[]{((float[])((float[])((Object[])((Object[])var1[0]))[53]))[0], ((float[])((float[])((Object[])((Object[])var1[0]))[53]))[1], ((float[])((float[])((Object[])((Object[])var1[0]))[53]))[2]};
         ena.a(var2, 2, var6);
         eea.a(var6[2], var6[0], false, (Object[])((Object[])var1[15]), (Object[])((Object[])var1[17]), var6[1]);
      }

   }

   private final void a(byte var1, String var2, int var3, int var4, int var5, int var6, String var7) throws Exception {
      try {
         foa.d = var5;
         aba.a = "1.1";
         mda.e = var3;
         so.a = var4;
         ++z;
         opa.a = "Unknown";
         qd.e = var6;

         try {
            opa.a = System.getProperty("java.vendor");
            aba.a = System.getProperty("java.version");
         } catch (Exception var20) {
            ;
         }

         try {
            bva.e = System.getProperty("os.name");
         } catch (Exception var19) {
            bva.e = "Unknown";
         }

         mna.h = bva.e.toLowerCase();

         try {
            gv.f = System.getProperty("os.arch").toLowerCase();
         } catch (Exception var18) {
            gv.f = "";
         }

         if(var1 < -21) {
            try {
               bj.g = System.getProperty("os.version").toLowerCase();
            } catch (Exception var17) {
               bj.g = "";
            }

            try {
               ts.e = System.getProperty("user.home");
               if(null != ts.e) {
                  ts.e = ts.e + "/";
               }
            } catch (Exception var16) {
               ;
            }

            if(null == ts.e) {
               ts.e = "~/";
            }

            try {
               fo.d = Toolkit.getDefaultToolkit().getSystemEventQueue();
            } catch (Throwable var15) {
               ;
            }

            dh.a = new String[]{".jagex_cache_" + so.a, ".file_store_" + so.a};
            bua.d = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", ts.e, "/tmp/", ""};
            int var8 = 0;

            int var11;
            File var12;
            label173:
            while(var8 < 4) {
               av.c = this.a(1, var2, var8, var7);
               if(!av.c.exists()) {
                  av.c.mkdirs();
               }

               File[] var9 = av.c.listFiles();
               if(var9 == null) {
                  break;
               }

               File[] var10 = var9;
               var11 = 0;

               while(true) {
                  if(~var11 <= ~var10.length) {
                     break label173;
                  }

                  var12 = var10[var11];
                  if(!this.a(false, (int)26662, var12)) {
                     ++var8;
                     break;
                  }

                  ++var11;
               }
            }

            File var23 = av.c;
            kta.o = var23;
            if(!kta.o.exists()) {
               throw new RuntimeException("");
            } else {
               qu.a = true;

               try {
                  File var24 = new File(ts.e, "random.dat");
                  if(!var24.exists()) {
                     label152:
                     for(int var30 = 0; ~var30 > ~dh.a.length; ++var30) {
                        for(var11 = 0; var11 < bua.d.length; ++var11) {
                           var12 = new File(bua.d[var11] + dh.a[var30] + File.separatorChar + "random.dat");
                           if(var12.exists()) {
                              cj.d = wta.a(24, new Object[5], es.a(new Object[3], 25L, "rw", (byte)-36, var12), (byte)-100, 0);
                              break label152;
                           }
                        }
                     }
                  } else {
                     cj.d = wta.a(24, new Object[5], es.a(new Object[3], 25L, "rw", (byte)-36, var24), (byte)-100, 0);
                  }

                  if(null == cj.d) {
                     RandomAccessFile var26 = new RandomAccessFile(var24, "rw");
                     var11 = var26.read();
                     var26.seek(0L);
                     var26.write(var11);
                     var26.seek(0L);
                     var26.close();
                     cj.d = wta.a(24, new Object[5], es.a(new Object[3], 25L, "rw", (byte)-36, var24), (byte)-100, 0);
                  }
               } catch (IOException var21) {
                  ;
               }

               nu.a = wta.a(5200, new Object[5], es.a(new Object[3], 524288000L, "rw", (byte)-36, rf.a("main_file_cache.dat2", 0)), (byte)-100, 0);
               wn.b = wta.a(6000, new Object[5], es.a(new Object[3], 1048576L, "rw", (byte)-36, rf.a("main_file_cache.idx255", 0)), (byte)-100, 0);
               rb.a = new Object[foa.d][];

               for(int var25 = 0; foa.d > var25; ++var25) {
                  rb.a[var25] = wta.a(6000, new Object[5], es.a(new Object[3], 1048576L, "rw", (byte)-36, rf.a("main_file_cache.idx" + var25, 0)), (byte)-100, 0);
               }

               try {
                  roa.b = new kra();
               } catch (Exception var14) {
                  eb.f = false;
               }

               wta.c = new asa();
               ThreadGroup var29 = Thread.currentThread().getThreadGroup();

               for(ThreadGroup var28 = var29.getParent(); null != var28; var28 = var28.getParent()) {
                  var29 = var28;
               }

               Thread[] var31 = new Thread[1000];
               var29.enumerate(var31);

               for(int var32 = 0; ~var32 > ~var31.length; ++var32) {
                  if(null != var31[var32] && var31[var32].getName().startsWith("AWT")) {
                     var31[var32].setPriority(1);
                  }
               }

               Thread var27 = new Thread(this);
               var27.setDaemon(true);
               var27.start();
               var27.setPriority(1);
            }
         }
      } catch (RuntimeException var22) {
         throw vt.a(var22, "gi.GA(" + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + (var7 != null?"{...}":"null") + ')');
      }
   }

   private final void i(int var1) {
      ++m;
      if(var1 == 32000) {
         long var2 = he.a(55);
         long var4 = cr.f[je.h];
         cr.f[je.h] = var2;
         je.h = 31 & 1 + je.h;
         if(~var4 != -1L && var2 > var4) {
            int var6 = (int)(-var4 + var2);
            wka.a = ((var6 >> 1) + 32000) / var6;
         }

         if(c++ > 50) {
            label21: {
               c -= 50;
               ofa.c = true;
               ru.d.setSize(wr.n, nma.a);
               ru.d.setVisible(true);
               if(null != opa.g && gf.b == null) {
                  Insets var7 = opa.g.getInsets();
                  ru.d.setLocation(pa.f_i + var7.left, mr.e + var7.top);
                  if(client.f_vb == 0) {
                     break label21;
                  }
               }

               ru.d.setLocation(pa.f_i, mr.e);
            }
         }

         this.d((byte)79);
      }
   }

   private final void e(int var1) {
      ++Y;
      long var2 = he.a(49);
      long var4 = laa.a[lma.d];
      laa.a[lma.d] = var2;
      if(var1 <= 35) {
         j = -34;
      }

      lma.d = 31 & 1 + lma.d;
      if(var4 != 0L && var2 > var4) {
         ;
      }

      synchronized(this) {
         kj.j = dka.b;
      }

      this.b((byte)98);
   }

   public final URL getDocumentBase() {
      ++q;
      return ej.a(14193) != kl.f?super.getDocumentBase():null;
   }

   public final synchronized void paint(Graphics var1) {
      ++n;
      if(!ira.g) {
         ofa.c = true;
         if(1000L < -kv.h + he.a(-119)) {
            Rectangle var2 = var1.getClipBounds();
            if(var2 == null || rp.a <= var2.width && var2.height >= jma.h) {
               Class_ls.k = true;
            }
         }

      }
   }

   static final void a(byte var0, Object[] var1) {
      int var2 = -14 % ((var0 + 71) / 34);
      ++f_l;
      md.a(((int[])((int[])var1[0]))[1], 0, ((int[])((int[])var1[0]))[2], (byte)-117);
   }

   abstract void d(byte var1);

   public final void windowClosed(WindowEvent var1) {
      ++B;
   }

   final void a(int var1, byte var2, String var3, String var4, int var5, int var6, Object[] var7, int var8, boolean var9) {
      try {
         this.a(var9, (byte)103, jb.b);
         rp.a = wr.n = ila.a(0, var7);
         jma.h = nma.a = tj.a(var7, var2 - 21861);
         pa.f_i = 0;
         mr.e = 0;
         if(ej.a(var2 + 14223) == ada.a) {
            rp.a += eo.a(var2 + 31, var7) * 2;
            int var10 = jma.h;
            int var11 = ((int[])((int[])var7[1]))[1];
            jma.h = 2 * var11 + var10;
            String var12 = (String)var7[0];
            this.a(var2 ^ -30, var12);
         }

         rta.d = this;
         this.a((byte)-79, var3, var1, var6, var8, var5, var4);
         if(var2 != -30) {
            ((boolean[])((boolean[])g[2]))[13] = true;
         }
      } catch (Throwable var13) {
         taa.a(var13, 32, (String)null);
         this.a("crash", (byte)67);
      }

      ++E;
   }

   public final String getParameter(String var1) {
      ++U;
      return ej.a(14193) != kl.f?super.getParameter(var1):null;
   }

   private final File a(int var1, String var2, int var3, String var4) {
      ++K;
      String var5 = 0 == var3?"":"" + var3;
      qd.b = new File(ts.e, "jagex_cl_" + var4 + "_" + var2 + var5 + ".dat");
      if(var1 != 1) {
         ((long[])((long[])g[7]))[0] = -11L;
      }

      String var6 = null;
      String var7 = null;
      boolean var8 = false;
      File var23;
      if(qd.b.exists()) {
         try {
            Object[] var9 = es.a(new Object[3], 10000L, "rw", (byte)-36, qd.b);

            Object[] var10;
            int var11;
            for(var10 = hi.newByteBufferWrapper((int)oca.a(true, var9)); ((byte[])((byte[])var10[2])).length > ((int[])((int[])var10[1]))[0]; ((int[])((int[])var10[1]))[0] += var11) {
               var11 = bpa.a(-((int[])((int[])var10[1]))[0] + ((byte[])((byte[])var10[2])).length, (byte)34, var9, (byte[])((byte[])var10[2]), ((int[])((int[])var10[1]))[0]);
               if(~var11 == 0) {
                  throw new IOException();
               }
            }

            ((int[])((int[])var10[1]))[0] = 0;
            var11 = fh.a(var10, false);
            if(1 > var11 || 2 < var11) {
               throw new IOException("" + var11);
            }

            int var12 = 0;
            if(var11 > 1) {
               var12 = fh.a(var10, false);
            }

            var6 = wta.a((byte)115, var10);
            if(var12 == 1) {
               var7 = wta.a((byte)-55, var10);
            }

            it.a(var9, false);
         } catch (IOException var19) {
            var19.printStackTrace();
         }

         if(var6 != null) {
            var23 = new File(var6);
            if(!var23.exists()) {
               var6 = null;
            }
         }

         if(null != var6) {
            var23 = new File(var6, "test.dat");
            if(!this.a(true, (int)26662, var23)) {
               var6 = null;
            }
         }
      }

      if(null == var6 && 0 == var3) {
         label111:
         for(int var20 = 0; dh.a.length > var20; ++var20) {
            for(int var22 = 0; var22 < bua.d.length; ++var22) {
               File var24 = new File(bua.d[var22] + dh.a[var20] + File.separatorChar + var4 + File.separatorChar);
               if(var24.exists() && this.a(true, (int)26662, new File(var24, "test.dat"))) {
                  var6 = var24.toString();
                  var8 = true;
                  break label111;
               }
            }
         }
      }

      if(null == var6) {
         var8 = true;
         var6 = ts.e + File.separatorChar + "jagexcache" + var5 + File.separatorChar + var4 + File.separatorChar + var2 + File.separatorChar;
      }

      if(var7 != null) {
         File var21 = new File(var7);
         var23 = new File(var6);

         try {
            File[] var25 = var21.listFiles();
            File[] var26 = var25;

            for(int var13 = 0; ~var13 > ~var26.length; ++var13) {
               File var14 = var26[var13];
               File var15 = new File(var23, var14.getName());
               boolean var16 = var14.renameTo(var15);
               if(!var16) {
                  throw new IOException();
               }
            }
         } catch (Exception var18) {
            var18.printStackTrace();
         }

         var8 = true;
      }

      if(var8) {
         this.a(true, new File(var6), (File)null);
      }

      return new File(var6);
   }

   public final void windowOpened(WindowEvent var1) {
      ++s;
   }

   abstract void a(int var1);

   final void a(String var1, byte var2) {
      ++h;
      if(!this.u) {
         this.u = true;
         System.out.println("error_game_" + var1);

         try {
            fu.a("loggedout", false, this);
            if(var2 != 67) {
               this.u = false;
            }
         } catch (Throwable var5) {
            ;
         }

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_top");
         } catch (Exception var4) {
            ;
         }

      }
   }

   public final void windowActivated(WindowEvent var1) {
      ++v;
   }

   public final AppletContext getAppletContext() {
      ++Q;
      return ej.a(14193) == kl.f?null:super.getAppletContext();
   }

   final boolean h(int var1) {
      if(var1 < 56) {
         ((long[])((long[])g[0]))[21] = -49L;
      }

      ++k;
      return hp.a((byte)-92, "jagtheora");
   }

   abstract void b(byte var1);

   public final void windowClosing(WindowEvent var1) {
      this.destroy();
      ++w;
   }

   public final URL getCodeBase() {
      ++f;
      return ej.a(14193) == kl.f?null:super.getCodeBase();
   }

   public final void windowDeactivated(WindowEvent var1) {
      ++T;
   }

   String a(byte var1) {
      int var2 = 73 / ((var1 - 9) / 59);
      ++t;
      return null;
   }

   final synchronized void e(byte var1) {
      if(var1 < -2) {
         ++x;
         this.c((int)-94);
         Object var3;
         if(null != gf.b) {
            var3 = gf.b;
         } else if(null != opa.g) {
            var3 = opa.g;
         } else {
            var3 = this;
         }

         Object[] var5 = new Object[2];
         var5[0] = mna.a((int)-106, var5);
         var5[1] = this;
         ru.d = (Canvas)(var5 != null?var5[0]:null);
         if(var5 != null && 1 == var5.length) {
            ((long[])((long[])nu.a[2]))[4] = ((long[])((long[])wn.b[28]))[2];
         }

         this.a((byte)37, (Container)var3);
      }
   }

   public final void destroy() {
      ++X;
      if(!ira.g) {
         hk.e = he.a(-23);
         qs.a(5000L, 108);
         this.a(true, false);
      }
   }

   private final void a(byte var1, Container var2) {
      ++e;
      var2.setBackground(Color.black);
      var2.setLayout((LayoutManager)null);
      var2.add(ru.d);
      ru.d.setSize(wr.n, nma.a);
      if(var1 != 37) {
         this.destroy();
      }

      ru.d.setVisible(true);
      if(var2 != opa.g) {
         ru.d.setLocation(pa.f_i, mr.e);
      } else {
         Insets var3 = opa.g.getInsets();
         ru.d.setLocation(pa.f_i + var3.left, mr.e + var3.top);
      }

      ru.d.addFocusListener(this);
      ru.d.requestFocus();
      kj.j = true;
      dka.b = true;
      ru.d.setFocusTraversalKeysEnabled(false);
      ofa.c = true;
      Class_ls.k = false;
      kv.h = he.a(60);
   }

   private final void c(int var1) {
      if(var1 >= -73) {
         j = 10;
      }

      if(ru.d != null) {
         ru.d.removeFocusListener(this);
         ru.d.getParent().setBackground(Color.black);
         ru.d.getParent().remove(ru.d);
      }

      ++y;
   }

   final boolean c(byte var1) {
      ++H;
      int var2 = 94 % ((-65 - var1) / 43);
      return hp.a((byte)-125, "jagmisc");
   }

   static final void g(int var0) {
      if(var0 == -3979) {
         ++A;
         ona.a(wp.c, -99);
      }
   }

   private final boolean a(boolean var1, int var2, File var3) {
      ++r;

      try {
         RandomAccessFile var4 = new RandomAccessFile(var3, "rw");
         int var5 = var4.read();
         if(var2 != 26662) {
            this.start();
         }

         var4.seek(0L);
         var4.write(var5);
         var4.seek(0L);
         var4.close();
         if(var1) {
            var3.delete();
         }

         return true;
      } catch (Exception var6) {
         return false;
      }
   }

   public final void stop() {
      ++J;
      if(!ira.g) {
         hk.e = 4000L + he.a(-122);
      }
   }

   private final void b(int var1) {
      ++O;
      if(null != opa.a) {
         String var2 = opa.a.toLowerCase();
         if(-1 != var2.indexOf("sun") || -1 != var2.indexOf("apple")) {
            String var3 = aba.a;
            if(var3.equals("1.1") || var3.startsWith("1.1.") || var3.equals("1.2") || var3.startsWith("1.2.") || var3.equals("1.3") || var3.startsWith("1.3.") || var3.equals("1.4") || var3.startsWith("1.4.") || var3.equals("1.5") || var3.startsWith("1.5.") || var3.equals("1.6.0")) {
               this.a("wrongjava", (byte)67);
               return;
            }

            if(var3.startsWith("1.6.0_")) {
               int var4;
               for(var4 = 6; ~var4 > ~var3.length() && ns.a((byte)67, var3.charAt(var4)); ++var4) {
                  ;
               }

               String var5 = var3.substring(6, var4);
               if(ft.a((byte)-123, var5) && -11 < ~bca.a((byte)7, var5)) {
                  this.a("wrongjava", (byte)67);
                  return;
               }
            }
         }
      }

      this.setFocusCycleRoot(true);
      if(var1 == 22790) {
         Class_e.f = 1 + (int)(Runtime.getRuntime().maxMemory() / 1048576L);
         nb.b = Runtime.getRuntime().availableProcessors();
         this.e((byte)-31);
         this.a((int)-124);

         Object var10;
         try {
            var10 = new kn();
         } catch (Throwable var9) {
            Object[] var12 = new Object[4];
            if(var12[0] == null) {
               var12[0] = new long[3];
            }

            if(null == var12[1]) {
               var12[1] = new int[2];
            }

            var12[2] = new long[10];
            ((long[])((long[])var12[0]))[0] = 0L;
            ((int[])((int[])var12[1]))[1] = 0;
            ((long[])((long[])var12[0]))[1] = 0L;
            ((long[])((long[])var12[0]))[2] = 0L;
            ((int[])((int[])var12[1]))[0] = 1;
            cb var7 = new cb(var12);
            var12[3] = var7;
            ((long[])((long[])var12[0]))[1] = System.nanoTime();
            ((long[])((long[])var12[0]))[2] = System.nanoTime();
            var10 = (cq)(null != var12?var12[3]:null);
         }

         ija.d = (cq)var10;

         while(0L == hk.e || ~he.a(80) > ~hk.e) {
            cv.c = ija.d.a((byte)-120, go.d);

            for(int var11 = 0; cv.c > var11; ++var11) {
               this.e((int)122);
            }

            this.i(var1 ^ 9222);
            lt.a((int)1392, (Object)ru.d);
         }

      }
   }

   static final boolean a(int var0, byte var1, Object[] var2) {
      if(var1 != 91) {
         a((String)null, (cga[])null, -101, (Object[])null, ((byte[])((byte[])g[6]))[0]);
      }

      ++V;
      return ((er[])((er[])var2[2]))[var0].f_i;
   }

   public abstract void init();

   final boolean a(boolean var1) {
      if(!var1) {
         return false;
      } else {
         ++d;
         return hp.a((byte)-128, "jaclib");
      }
   }

   public final void run() {
      ++a;

      try {
         try {
            this.b((int)22790);
         } catch (ThreadDeath var6) {
            throw var6;
         } catch (Throwable var7) {
            taa.a(var7, 32, this.a((byte)-115));
            this.a("crash", (byte)67);
            this.a(true, true);
            return;
         }

         this.a(true, true);
      } finally {
         this.a(true, true);
      }
   }

   static final String a(String var0, cga[] var1, int var2, Object[] var3, byte var4) {
      ++P;
      if(ob.a(var3, var0, false, var1) <= var2) {
         return var0;
      } else {
         var2 -= ob.a(var3, "...", false, (cga[])null);
         int var5 = -1;
         int var6 = -1;
         int var7 = 0;
         int var8 = var0.length();
         if(var3 != null && 9 == var3.length) {
            qc.a((cga[])null, -99, 5, (String)null, (Object[])null, -32183);
         }

         int var9 = -117 % ((19 - var4) / 37);
         String var10 = "";

         for(int var11 = 0; var11 < var8; ++var11) {
            char var12 = var0.charAt(var11);
            if(60 == var12) {
               var5 = var11;
            } else {
               if(62 == var12 && -1 != var5) {
                  String var13 = var0.substring(1 + var5, var11);
                  var5 = -1;
                  if(!var13.equals("lt")) {
                     if(var13.equals("gt")) {
                        var12 = 62;
                     } else if(!var13.equals("nbsp")) {
                        if(!var13.equals("shy")) {
                           if(var13.equals("times")) {
                              var12 = 215;
                           } else if(var13.equals("euro")) {
                              var12 = 8364;
                           } else if(var13.equals("copy")) {
                              var12 = 169;
                           } else {
                              if(!var13.equals("reg")) {
                                 if(var13.startsWith("img=") && null != var1) {
                                    try {
                                       int var14 = bca.a((byte)-121, var13.substring(4));
                                       var6 = -1;
                                       var7 += var1[var14].f();
                                       if(var7 > var2) {
                                          return var10 + "...";
                                       }

                                       var10 = var0.substring(0, 1 + var11);
                                    } catch (Exception var15) {
                                       ;
                                    }
                                 }
                                 continue;
                              }

                              var12 = 174;
                           }
                        } else {
                           var12 = 173;
                        }
                     } else {
                        var12 = 160;
                     }
                  } else {
                     var12 = 60;
                  }
               }

               if(-1 == var5) {
                  var7 += 255 & ((byte[])((byte[])var3[0]))[255 & so.a((byte)-102, var12)];
                  if(null != var3[2] && -1 != var6) {
                     var7 += ((byte[][])((byte[][])var3[2]))[var6][var12];
                  }

                  var6 = var12;
                  int var16 = var7;
                  if(null != var3[2]) {
                     var16 = var7 + ((byte[][])((byte[][])var3[2]))[var12][46];
                  }

                  if(var2 < var16) {
                     return var10 + "...";
                  }

                  var10 = var0.substring(0, 1 + var11);
               }
            }
         }

         return var0;
      }
   }

}
