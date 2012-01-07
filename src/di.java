import java.io.IOException;

final class di {

   static int b;
   static int f;
   static int h;
   static int f_i;
   static Object[] e = ed.a(19, new Object[1], (byte)-125, 145);
   static int c = 0;
   static Object[] a = sl.a("1", 0, new Object[1], "1");
   static Object[] d;
   static long g;


   static final void a(Object[] var0, int var1, boolean var2) {
      ++h;
      if(var1 <= -61) {
         if(var0[10] != null) {
            try {
               ((int[])((int[])((Object[])((Object[])var0[3]))[1]))[0] = 0;
               ek.putByte((Object[])((Object[])var0[3]), !var2?3:2);
               uk.put40BitInteger((Object[])((Object[])var0[3]), 0L);
               oua.writeBytesToOutputStreamWorker((Object[])((Object[])var0[10]), (byte[])((byte[])((Object[])((Object[])var0[3]))[2]), 0, ((byte[])((byte[])((Object[])((Object[])var0[3]))[2])).length);
            } catch (IOException var6) {
               try {
                  qi.a((Object[])((Object[])var0[10]), (int)4);
               } catch (Exception var5) {
                  ;
               }

               var0[10] = null;
               ++((int[])((int[])var0[1]))[0];
               ((int[])((int[])var0[1]))[1] = -2;
            }

         }
      }
   }

   static final void a(int var0, Object[] var1, Object[] var2, byte var3) {
      if(var3 >= -92) {
         d = (Object[])null;
      }

      if(var0 == 1) {
         ((char[])((char[])var1[0]))[0] = kf.a(true, ipa.a(var2, (int)-95));
      } else if(var0 == 5) {
         ((int[])((int[])var1[1]))[0] = de.a((int)0, var2);
      }

      ++f_i;
   }

   static final int[] a(int var0, Object[] var1, int var2) {
      ++f;
      if(var0 <= 63) {
         return (int[])((int[])e[7]);
      } else {
         int[] var3 = od.a(-1704, var2, (Object[])((Object[])var1[5]));
         if(((boolean[])((boolean[])((Object[])((Object[])var1[5]))[4]))[0]) {
            int var7 = ((int[])((int[])var1[1]))[3] * Class_is.a >> 12;
            int[] var8 = vea.a(var1, 0, var2 - 1 & wq.e, (byte)-8);
            int[] var9 = vea.a(var1, 0, var2, (byte)-8);
            int[] var10 = vea.a(var1, 0, wq.e & var2 + 1, (byte)-8);

            for(int var11 = 0; var11 < fo.b; ++var11) {
               int var12 = (var10[var11] + -var8[var11]) * var7 >> 12;
               int var13 = var7 * (-var9[var11 + 1 & td.q] + var9[td.q & -1 + var11]) >> 12;
               int var14 = var13 >> 4;
               int var15 = var12 >> 4;
               if(0 > var14) {
                  var14 = -var14;
               }

               if(var1 != null && (-6 == ~var1.length || 6 == var1.length || var1.length == 5)) {
                  lca.e = null;
               }

               if(0 > var15) {
                  var15 = -var15;
               }

               if(var14 > 255) {
                  var14 = 255;
               }

               if(255 < var15) {
                  var15 = 255;
               }

               int var16 = 255 & lca.e[var14 + ((1 + var15) * var15 >> 1)];
               int var6 = var16 * 4096 >> 8;
               int var4 = var16 * var13 >> 8;
               int var5 = var12 * var16 >> 8;
               var5 = var5 * ((int[])((int[])var1[14]))[1] >> 12;
               var6 = var6 * ((int[])((int[])var1[14]))[2] >> 12;
               var4 = var4 * ((int[])((int[])var1[14]))[0] >> 12;
               var3[var11] = var6 + var5 + var4;
            }
         }

         return var3;
      }
   }

   static final void a(Object[] var0, boolean var1, lm var2, long var3) {
      if(null != var2.d) {
         var2.a((byte)85);
      }

      if(!var1) {
         a(-14, (Object[])null, (Object[])null, (byte)67);
      }

      ++b;
      lm var5 = ((lm[])((lm[])var0[4]))[(int)((long)(-1 + ((int[])((int[])var0[1]))[1]) & var3)];
      var2.d = var5.d;
      var2.f = var5;
      var2.d.f = var2;
      var2.f.d = var2;
      var2.e = var3;
   }

   static {
      Object[] var1 = new Object[0];
      d = var1;
      g = 0L;
   }
}
