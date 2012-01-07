import java.io.IOException;
import java.util.Iterator;

final class ppa implements Iterator {

   static int e;
   static int f;
   static int a;
   static int j;
   static int k;
   static int d = 0;
   static int f_i;
   private Object[] b;
   static int h;
   static int g;
   static int c;


   static final void writeBytesToOutputStreamWorker(Object[] wrapper, byte[] src, int off, int len) throws IOException {
      ++f;
     Object[] var5 = (Object[])((Object[]) wrapper[1]);
     if(0 <= len && off >= 0 && len + off <= src.length) {
        synchronized(null != var5 ? var5[0] : null) {
           if(null != var5[3]) {
              throw new IOException(((Throwable)var5[3]).toString());
           } else {
              int var8;
              if(~((int[])((int[])var5[1]))[2] <= ~((int[])((int[])var5[1]))[0]) {
                 var8 = 1 + ((int[])((int[])var5[1]))[2] + ((int[])((int[])var5[1]))[1] + ((int[])((int[])var5[1]))[0];
              } else {
                 var8 = 1 + ((int[])((int[])var5[1]))[2] + ((int[])((int[])var5[1]))[0];
              }

              if(len <= var8) {
                 if(~((int[])((int[])var5[1]))[1] <= ~(len + ((int[])((int[])var5[1]))[2])) {
                    System.arraycopy(src, off, var5[2], ((int[])((int[])var5[1]))[2], len);
                 } else {
                    int var9 = -((int[])((int[])var5[1]))[2] + ((int[])((int[])var5[1]))[1];
                    System.arraycopy(src, off, var5[2], ((int[])((int[])var5[1]))[2], var9);
                    System.arraycopy(src, var9 + off, var5[2], 0, len - var9);
                 }

                 ((int[])((int[])var5[1]))[2] = (len + ((int[])((int[])var5[1]))[2]) % ((int[])((int[])var5[1]))[1];
                 var5[0].notifyAll();
              } else {
                 throw new IOException("");
              }
           }
        }
     } else {
        throw new IOException();
     }
   }

   static final Object[] a(int var0, int var1, boolean var2, int var3) {
      try {
         ++c;
         Object[] var4 = null;
         Object[] var8;
         if(null != nu.a) {
            Object[] var6 = new Object[4];
            Object[] var7 = nu.a;
            var8 = rb.a[var3];
            if(null == var6[1]) {
               var6[1] = new int[2];
            }

            ((int[])((int[])var6[1]))[0] = '\ufde8';
            var6[3] = null;
            var6[0] = null;
            tj var10 = new tj(var6);
            ((int[])((int[])var6[1]))[1] = var3;
            var6[3] = var7;
            ((int[])((int[])var6[1]))[0] = 1000000;
            var6[2] = var10;
            var6[0] = var8;
            if(null != var7 && var7.length == 4 && var7[2].equals(Boolean.valueOf(false))) {
               iea.a((byte)39);
            }

            var4 = var6;
         }

         Object[][] var5 = bpa.d;
         if(var0 != 14150) {
            a((Object[])null, 9, 67);
         }

         var8 = wb.e;
         Object[] var9 = ija.e;
         if(null == var8[4]) {
            throw new RuntimeException();
         } else if(var3 >= 0 && ~var3 > ~((Object[])((Object[])var8[6])).length) {
            Object[] var21;
            if(null != ((Object[][])((Object[][])var8[6]))[var3]) {
               var21 = ((Object[][])((Object[][])var8[6]))[var3];
            } else {
               ((int[])((int[])((Object[])((Object[])var8[4]))[1]))[0] = 6 + var3 * 72;
               int var11 = lr.a(1, (Object[])((Object[])var8[4]));
               int var12 = lr.a(var0 ^ 14151, (Object[])((Object[])var8[4]));
               byte[] var13 = new byte[64];
               Class_h.a((byte)-71, 64, (Object[])((Object[])var8[4]), var13, 0);
               Object[] var15 = new Object[14];
               Object[] var16 = (Object[])((Object[])var8[2]);
               Object[] var17 = (Object[])((Object[])var8[0]);
               if(null == var15[1]) {
                  var15[1] = new int[5];
               }

               if(var15[13] == null) {
                  var15[13] = new boolean[3];
               }

               if(null == var15[4]) {
                  var15[4] = new long[1];
               }

               ((int[])((int[])var15[1]))[0] = 0;
               var15[2] = nb.a((byte)126, 16, new Object[5]);
               ((int[])((int[])var15[1]))[1] = 0;
               var15[5] = ura.a(-21, new Object[2]);
               ((long[])((long[])var15[4]))[0] = 0L;
               ((int[])((int[])var15[1]))[3] = var3;
               var15[7] = var4;
               if(null == var15[7]) {
                  ((boolean[])((boolean[])var15[13]))[1] = false;
               } else {
                  ((boolean[])((boolean[])var15[13]))[1] = true;
                  var15[9] = ura.a(-111, new Object[2]);
               }

               var15[8] = var13;
               ((int[])((int[])var15[1]))[2] = var12;
               var15[3] = var9;
               ((boolean[])((boolean[])var15[13]))[2] = true;
               var15[6] = var16;
               ((int[])((int[])var15[1]))[4] = var11;
               var15[10] = var17;
               if(null != var15[3]) {
                  var15[11] = dd.a(true, (Object[])((Object[])var15[3]), (Object[])((Object[])var15[10]), ((int[])((int[])var15[1]))[3]);
               }

               var21 = var15;
               ((Object[][])((Object[][])var8[6]))[var3] = var15;
               if(null != var15 && 9 == var15.length) {
                  fo.a(127, 35, 35, 59, ((int[])((int[])cba.a[8]))[1], true, ((int[])((int[])((Object[])((Object[])vja.f_i[1]))[11]))[3]);
               }
            }

            var5[var3] = var21;
            Class_t.a(bpa.d[var3], (byte)112);
            if(var4 != null && var4.length == 13) {
               jn.g = true;
            }

            Object[] var20 = new Object[6];
            Object[] var22 = bpa.d[var3];
            eva.a((byte)-70, var20);
            gaa.a(var20, (int)-88);
            if(var1 >= 0 && var1 <= 2) {
               var20[2] = var22;
               ((boolean[])((boolean[])var20[0]))[0] = var2;
               ((int[])((int[])var20[1]))[0] = var1;
               return var20;
            } else {
               throw new IllegalArgumentException("");
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var19) {
         throw vt.a(var19, "ppa.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   public final Object next() {
      ++a;
      return io.a(this.b, (byte)45);
   }

   static final boolean a(int var0, Object[] var1) {
      ++f_i;
      if(var0 != 2) {
         d = 103;
      }

      return 1.0F == ((float[])((float[])var1[0]))[0] && 0.0F == ((float[])((float[])var1[0]))[1] && ((float[])((float[])var1[0]))[2] == 0.0F && ((float[])((float[])var1[0]))[3] == 0.0F && ((float[])((float[])var1[0]))[4] == 0.0F && ((float[])((float[])var1[0]))[5] == 1.0F && 0.0F == ((float[])((float[])var1[0]))[6] && ((float[])((float[])var1[0]))[7] == 0.0F && 0.0F == ((float[])((float[])var1[0]))[8] && 0.0F == ((float[])((float[])var1[0]))[9] && 1.0F == ((float[])((float[])var1[0]))[10] && 0.0F == ((float[])((float[])var1[0]))[11] && 0.0F == ((float[])((float[])var1[0]))[12] && ((float[])((float[])var1[0]))[13] == 0.0F && ((float[])((float[])var1[0]))[14] == 0.0F && 1.0F == ((float[])((float[])var1[0]))[15];
   }

   ppa(Object[] var1) {
      this.b = var1;
   }

   static final Object[] a(Object[] var0, int var1) {
      int var2 = 97 / ((var1 - 49) / 57);
      ++e;
      return vk.f;
   }

   public final boolean hasNext() {
      ++g;
      Object[] var2 = this.b;
      if(var2 != null && (-10 == ~var2.length || -17 == ~var2.length || var2.length == 2 && var2[1].equals(Integer.valueOf(2)))) {
         this.remove();
      }

      boolean var1;
      if(((lm[])((lm[])((Object[])((Object[])var2[3]))[2]))[((int[])((int[])var2[1]))[0] - 1] == var2[4]) {
         while(true) {
            if(~((int[])((int[])var2[1]))[0] <= ~((int[])((int[])((Object[])((Object[])var2[3]))[1]))[0]) {
               var1 = false;
               break;
            }

            lm[] var10000 = (lm[])((lm[])((Object[])((Object[])var2[3]))[2]);
            int[] var10001 = (int[])((int[])var2[1]);
            int var10004 = ((int[])((int[])var2[1]))[0];
            var10001[0] = ((int[])((int[])var2[1]))[0] + 1;
            if(var10000[var10004].f != ((lm[])((lm[])((Object[])((Object[])var2[3]))[2]))[-1 + ((int[])((int[])var2[1]))[0]]) {
               var2[4] = ((lm[])((lm[])((Object[])((Object[])var2[3]))[2]))[((int[])((int[])var2[1]))[0] - 1].f;
               var1 = true;
               break;
            }

            var2[4] = ((Object[])((Object[])((Object[])((Object[])var2[3]))[2]))[((int[])((int[])var2[1]))[0] - 1];
         }
      } else {
         var1 = true;
      }

      return var1;
   }

   static final void a(boolean var0, Object[] var1) {
      var1[3] = sj.a(64, new Object[3], (byte)-85);
      ++h;
      var1[4] = sj.a(50, new Object[3], (byte)-96);
      Object[] var4 = new Object[3];
      if(var0) {
         d = ((int[])((int[])var1[2]))[1];
      }

      vaa.a(1, var4);
      ns.a((byte)-65, var4);
      ((int[])((int[])var4[1]))[1] = 250;
      ((int[])((int[])var4[1]))[0] = 250;

      int var5;
      for(var5 = 1; var5 + var5 < 250; var5 += var5) {
         ;
      }

      if(null != var4 && (-17 == ~var4.length && var4[6].equals(Integer.valueOf(2)) && var4[6].equals(Integer.valueOf(0)) || -5 == ~var4.length && var4[2].equals(Integer.valueOf(2)))) {
         Class_h.a((byte)22, (Object[])null);
      }

      var4[2] = nb.a((byte)96, var5, new Object[5]);
      var1[5] = var4;
      var1[10] = wha.a(new Object[2], (byte)-119);
   }

   static final int[][] a(Object[] var0, int var1, int var2) {
      ++j;
      int[][] var3 = loa.a((byte)-52, var2, (Object[])((Object[])var0[4]));
      if(var1 != -4597) {
         d = 17;
      }

      if(((boolean[])((boolean[])((Object[])((Object[])var0[4]))[0]))[0]) {
         int[] var4 = var3[0];
         int[] var5 = var3[1];
         int[] var6 = var3[2];

         for(int var7 = 0; var7 < fo.b; ++var7) {
            var4[var7] = ((int[])((int[])var0[1]))[2];
            var5[var7] = ((int[])((int[])var0[1]))[1];
            var6[var7] = ((int[])((int[])var0[1]))[3];
         }
      }

      return var3;
   }

   public final void remove() {
      ++k;
      wea.b((int)9, this.b);
   }

}
