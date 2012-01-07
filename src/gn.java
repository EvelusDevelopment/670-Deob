import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

final class gn extends lm {

   static int s;
   static int f_l;
   static int n;
   static int t;
   static Object[] k = null;
   static int o;
   Object[] j;
   static int m;
   static int[][] p;
   static int q;
   static Object[] r = ura.a(-27, new Object[2]);


   static final Object[] a(int var0, int var1) {
      ++n;
      Object[][] var2 = new Object[][]{bu.b, uha.g, vw.e, op.h, Class_k.e};
      Object[][] var3 = var2;
      if(var1 < 101) {
         ((int[])((int[])k[19]))[0] = ((int[])((int[])k[4]))[6];
      }

      for(int var4 = 0; var3.length > var4; ++var4) {
         Object[] var5 = var3[var4];
         if(((int[])((int[])var5[1]))[0] == var0) {
            return var5;
         }
      }

      return null;
   }

   static final void a(int var0, int var1, Object[] var2, Object[] var3) {
      if(var0 != -24120) {
         p = (int[][])((int[][])null);
      }

      ++o;
      if(var1 == 0) {
         var3[22] = new Object[fh.a(var2, false)][];

         for(int var4 = 0; ~var4 > ~((Object[])((Object[])var3[22])).length; ++var4) {
            int var5 = fh.a(var2, false);
            if(var5 != 2) {
               Object[] var12;
               int var13;
               if(var5 != 0) {
                  if(1 == var5) {
                     ((Object[][])((Object[][])var3[22]))[var4] = wl.a(var2, (byte)-104);
                  } else if(3 == var5) {
                     Object[][] var9 = (Object[][])((Object[][])var3[22]);
                     var12 = new Object[3];
                     var13 = jia.c(-8166, var2);
                     int var21 = jia.c(-8166, var2);
                     int var29 = jia.c(-8166, var2);
                     int var37 = jia.c(-8166, var2);
                     int var45 = td.a(var2, var0 ^ -24188);
                     if(var12 != null && (-3 == ~var12.length && var12[1].equals(Integer.valueOf(0)) || -6 == ~var12.length || -12 == ~var12.length)) {
                        poa.b((Object[])null, 12976);
                     }

                     int var53 = td.a(var2, 124);
                     Object[] var11 = rs.a((byte)126, var37, var13, var45, var53, fh.a(var2, false), var29, var21, var12);
                     var9[var4] = var11;
                  }
               } else {
                  Object[][] var6 = (Object[][])((Object[][])var3[22]);
                  var12 = new Object[4];
                  var13 = jia.c(-8166, var2);
                  int var20 = jia.c(-8166, var2);
                  int var27 = jia.c(-8166, var2);
                  int var34 = jia.c(-8166, var2);
                  if(null != var12 && var12.length == 13) {
                     poa.b((Object[])null, 12976);
                  }

                  int var41 = td.a(var2, var0 + 24207);
                  Object[] var8 = ura.a(true, var27, var20, var34, var12, var13, var41, fh.a(var2, false));
                  var6[var4] = var8;
               }
            } else {
               ((Object[][])((Object[][])var3[22]))[var4] = Class_v.a(var2, (byte)-60);
            }
         }
      } else if(var1 == 1) {
         ((boolean[])((boolean[])var3[3]))[0] = fh.a(var2, false) == 1;
      }

   }

   static final int[][] a(int var0, boolean var1, int var2, int var3, int var4, int var5, float var6, int var7, int var8) {
      ++m;
      int[][] var9 = new int[var3][var5];
      int var11 = 40 % ((var2 + 8) / 56);
      Object[] var12 = new Object[9];
      mqa.a((byte)113, var12);
      uca.a(0, var12, false, true);
      Class_k.a((byte)123, var12);
      Object[] var13 = var12;
      ((int[])((int[])var12[1]))[1] = var0;
      ((int[])((int[])var12[1]))[4] = var7;
      ((int[])((int[])var12[1]))[2] = var4;
      ((int[])((int[])var12[1]))[3] = (int)(4096.0F * var6);
      ((boolean[])((boolean[])var12[3]))[1] = var1;
      mqa.a(var12, -1);
      foa.a((byte)-97, var3, var5);

      for(int var14 = 0; var3 > var14; ++var14) {
         client.a(false, var9[var14], var14, var13);
      }

      return var9;
   }

   gn(Object[] var1) {
      this.j = var1;
   }

   static final Object[] c(Object[] var0, byte var1) {
      if(var1 <= 28) {
         c((Object[])((Object[])((Object[])((Object[])k[10]))[17]), (byte)-101);
      }

      if(var0[0] == null) {
         var0[0] = new boolean[1];
      }

      if(null == var0[1]) {
         var0[1] = new int[3];
      }

      ++s;
      ((boolean[])((boolean[])var0[0]))[0] = false;
      return var0;
   }

   static final void a(int var0, int var1, Object[] var2) {
      ++f_l;
      if(var1 != 22790) {
         p = (int[][])((int[][])((Object[])((Object[])((Object[])((Object[])var2[1]))[2]))[27]);
      }

      ((Stream)var2[9]).b();
      Object[] var3 = pma.a(4 * var0, 125, 4, false, (Object[])((Object[])var2[2]), (Buffer)var2[10]);
      if(null != var3 && var3.length == 5) {
         ((NativeHeapBuffer)var2[10]).c();
      }

      var2[5] = dq.a(var3, 5121, 4, 0, new Object[3], 3);
      var2[9] = null;
      var2[10] = null;
   }

   static final int a(Object[] var0, byte var1) {
      ++q;
      int var2 = -45 % ((var1 + 43) / 55);
      return var0[42] != null && ((int[])((int[])((Object[])((Object[])var0[42]))[1]))[1] != -1?((int[])((int[])jra.a((byte)-114, ((int[])((int[])((Object[])((Object[])var0[42]))[1]))[1], nt.f_i)[1]))[18]:th.a(var0, 28);
   }

   static final void b(Object[] var0, byte var1) {
      ((int[])((int[])var0[12]))[55] = 0;
      ((int[])((int[])var0[12]))[47] = -1;
      ((int[])((int[])var0[12]))[52] = -1;
      ((boolean[])((boolean[])var0[8]))[13] = false;
      ++t;
      ((int[])((int[])var0[12]))[45] = 0;
      ((int[])((int[])var0[12]))[56] = 0;
      ((int[])((int[])var0[12]))[54] = -1;
      ((int[])((int[])var0[12]))[53] = -1;
      ((byte[])((byte[])var0[10]))[8] = 0;
      if(var0 == null || 1 != var0.length || !var0[0].equals(Integer.valueOf(1))) {
         ((int[])((int[])var0[12]))[41] = -1;
         ((boolean[])((boolean[])var0[8]))[15] = false;
         ((boolean[])((boolean[])var0[8]))[12] = false;
         if(var1 != -39) {
            a(56, true, ((int[])((int[])r[14]))[3], 6, ((int[])((int[])r[0]))[0], -81, 0.92973816F, 90, 119);
         }

         ((int[])((int[])var0[12]))[50] = -1;
         ((int[])((int[])var0[12]))[51] = -1;
         ((int[])((int[])var0[12]))[46] = 0;
         ((int[])((int[])var0[12]))[44] = -1;
         ((boolean[])((boolean[])var0[8]))[14] = false;
         ((boolean[])((boolean[])var0[8]))[11] = false;
         ((int[])((int[])var0[12]))[43] = 0;
         ((int[])((int[])var0[12]))[49] = 255;
         ((boolean[])((boolean[])var0[8]))[10] = false;
         var0[38] = uta.a(new Object[2], 16, 1);
      }
   }

}
