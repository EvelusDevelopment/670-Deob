
final class hna extends lm {

   static int n;
   static int m;
   static int o;
   static int f_l;
   static long[] p = new long[100];
   Object[] k;
   static Object[] q = ed.a(8, new Object[1], (byte)-118, 72);
   static int j;
   static int r;


   static final float[] a(byte var0, float[] var1, Object[] var2) {
      if(var0 < 3) {
         return (float[])null;
      } else {
         ++f_l;
         var1[0] = ((float[])((float[])var2[0]))[0];
         var1[3] = ((float[])((float[])var2[0]))[12];
         var1[2] = ((float[])((float[])var2[0]))[8];
         var1[1] = ((float[])((float[])var2[0]))[4];
         var1[6] = ((float[])((float[])var2[0]))[9];
         var1[8] = ((float[])((float[])var2[0]))[2];
         var1[7] = ((float[])((float[])var2[0]))[13];
         var1[4] = ((float[])((float[])var2[0]))[1];
         var1[5] = ((float[])((float[])var2[0]))[5];
         var1[10] = ((float[])((float[])var2[0]))[10];
         var1[9] = ((float[])((float[])var2[0]))[6];
         var1[11] = ((float[])((float[])var2[0]))[14];
         var1[12] = ((float[])((float[])var2[0]))[3];
         if(var2 != null && -6 == ~var2.length && var2[0].equals(Boolean.valueOf(false))) {
            return null;
         } else {
            var1[14] = ((float[])((float[])var2[0]))[11];
            var1[13] = ((float[])((float[])var2[0]))[7];
            var1[15] = ((float[])((float[])var2[0]))[15];
            return var1;
         }
      }
   }

   static final void a(int var0, Object[] var1) {
      ++j;
      if(var0 > -52) {
         q = (Object[])null;
      }

      rf.a(0, 82, var1);
   }

   static final Object[] a(Object[] var0, int var1) {
      if(null == var0[0]) {
         var0[0] = new char[1];
      }

      if(var0[1] == null) {
         var0[1] = new int[1];
      }

      ++r;
      ((int[])((int[])var0[1]))[0] = 1;
      if(var1 > -36) {
         a((Object[])null, ((int[])((int[])((Object[])((Object[])q[9]))[7]))[17]);
      }

      return var0;
   }

   static final void a(int var0, boolean var1) {
      ++o;
      Object[][] var2 = lba.d;

      for(int var3 = 0; ~var3 > ~var2.length; ++var3) {
         Object[] var4 = var2[var3];
         ica.a(var4, false);
      }

      im.a(-2);
      pa.a(0);
      ro.a();
      int var6 = 0;
      if(var0 >= -68) {
         a(((byte[])((byte[])((Object[])((Object[])q[2]))[0]))[1], (float[])null, (Object[])null);
      }

      while(4 > var6) {
         kh.a(-122, hj.f_i[var6]);
         ++var6;
      }

      te.a(false, (byte)74);
      System.gc();
      mn.a((byte)86, 2);
      si.b = -1;
      qk.d = false;
      ac.a((byte)47);
      bf.a(true, (byte)109);
      te.a(false, (byte)117);
      if(rga.d >= 0 && rga.d != 0) {
         lg.a(false, rga.d, (byte)-113);
         rga.d = -1;
      }

      ona.a(hqa.c, -100);
      ona.a(soa.f, -77);
      eo.a((byte)-126);
      if(!var1) {
         iea.a(9, (byte)-122);

         try {
            fu.a("loggedout", false, kqa.h);
         } catch (Throwable var5) {
            ;
         }
      } else {
         iea.a(1, (byte)-102);
      }

   }

   static final Object[] a(int var0, Object[] var1, int var2, int var3, int var4) {
      if(null == var1[1]) {
         var1[1] = new int[3];
      }

      ++n;
      rf.a(var3, -1476, var1, var2);
      if(var0 != 0) {
         p = (long[])((long[])var1[11]);
      }

      ((int[])((int[])var1[1]))[2] = var4;
      return var1;
   }

   static final void a(String var0, int var1) {
      ++m;
      if(null != var0) {
         if((200 > ola.c || ke.b) && 200 > ola.c) {
            String var2 = dm.a((int)-112, var0);
            if(null != var2) {
               int var3;
               String var4;
               String var5;
               for(var3 = 0; var3 < ola.c; ++var3) {
                  var4 = dm.a((int)-70, ir.a[var3]);
                  if(var4 != null && var4.equals(var2)) {
                     kaa.a(var0 + gj.a(dp.y, -42, gj.Y), -127, 4);
                     return;
                  }

                  if(null != fc.b[var3]) {
                     var5 = dm.a((int)-58, fc.b[var3]);
                     if(null != var5 && var5.equals(var2)) {
                        kaa.a(var0 + gj.a(dp.y, 125, gj.Y), -54, 4);
                        return;
                     }
                  }
               }

               if(var1 <= 13) {
                  q = (Object[])null;
               }

               for(var3 = 0; kl.k > var3; ++var3) {
                  var4 = dm.a((int)-78, eb.a[var3]);
                  if(null != var4 && var4.equals(var2)) {
                     kaa.a(gj.a(dp.y, 66, gj.f_jb) + var0 + gj.a(dp.y, 88, gj.q), -84, 4);
                     return;
                  }

                  if(null != le.b[var3]) {
                     var5 = dm.a((int)-128, le.b[var3]);
                     if(null != var5 && var5.equals(var2)) {
                        kaa.a(gj.a(dp.y, 110, gj.f_jb) + var0 + gj.a(dp.y, 112, gj.q), -127, 4);
                        return;
                     }
                  }
               }

               if(!dm.a((int)-125, (String)uta.g[37]).equals(var2)) {
                  ++eu.q;
                  Object[] var6 = hua.a(true);
                  Object[] var7 = ona.a((byte)116, (Object[])((Object[])var6[7]), pda.a);
                  ek.putByte((Object[])((Object[])var7[0]), vs.a(var0, (byte)14));
                  bw.a(var0, (byte)0, (Object[])((Object[])var7[0]));
                  lj.a(var7, 6, var6);
               } else {
                  kaa.a(gj.a(dp.y, 83, gj.j), -56, 4);
               }
            }
         } else {
            kaa.a(gj.a(dp.y, 61, gj.f_kb), -93, 4);
         }
      }
   }

   hna(Object[] var1) {
      this.k = var1;
   }

}
