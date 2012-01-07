import java.util.Vector;

final class bta {

   static int e;
   static int c;
   static int b;
   static Object[] a = lfa.a("", 9, "", new Object[1], 6, "");
   static int g;
   static int f;
   static int d;


   static final void a(byte var0, int var1) {
      if(var0 != -22) {
         a(-18, (Object[])((Object[])a[19]));
      }

      ++e;
      Object[] var2 = la.a(0, (long)var1, 11);
      aia.a(var2, 1);
   }

   static final boolean a(int var0, int var1, int var2, int var3, int var4, Object[] var5) {
      try {
         ++b;
         if(((Vector)var5[14]).isEmpty()) {
            return false;
         } else {
            Object[] var8;
            if(~var1 != ~((int[])((int[])var5[1]))[0] || ((int[])((int[])var5[1]))[2] != var2 && (var8 = (Object[])((Object[])var5[10])) != null && -92 == ~var8.length) {
               ((int[])((int[])var5[1]))[0] = var1;
               ((int[])((int[])var5[1]))[2] = var2;
               bla.a(var5, -64);
               ada.d(var5, 0);
            }

            if(var4 != -23920) {
               a(-101, ((int[])((int[])a[1]))[20], 39, ((int[])((int[])a[2]))[8], 46, (Object[])null);
            }

            ((hsa)var5[2]).a(0, (re)var5[12]);
            if(var5[5] != null) {
               ((hsa)var5[2]).a((lua)var5[5]);
            }

            Object[] var6;
            ((ta)(null != (var6 = (Object[])((Object[])var5[10]))?var6[38]:null)).a((hsa)var5[2], 59);
            Object[] var7;
            ((ta)((var7 = (Object[])((Object[])var5[10])) == null?null:var7[38])).Z(3, -16777216);
            Object[] var9 = (Object[])((Object[])var5[10]);
            if(var5 != null && var5.length == 28 && var5[13].equals(Integer.valueOf(2))) {
               dk.a((Object[])null, (byte)124);
            }

            if(null != var9 && var9.length == 87) {
               pa.a(var9, true, 15);
            } else {
               if(null == var9 || 91 != var9.length) {
                  throw new IllegalStateException();
               }

               sh.a(15, var9, false);
            }

            tn.a((Object[])((Object[])var5[10]), 0, -28232);
            if(((hsa)var5[2]).f()) {
               ((boolean[])((boolean[])var5[8]))[0] = true;
               return true;
            } else {
               throw new RuntimeException("");
            }
         }
      } catch (RuntimeException var11) {
         throw vt.a(var11, "bta.F(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null?"{...}":"null") + ')');
      }
   }

   static final Class getClassByName(String var0, boolean var1) throws ClassNotFoundException {
      System.out.println(var0);
      ++c;
      return !var0.equals("B")?(!var0.equals("I")?(!var0.equals("S")?(!var1?(Class)null:(!var0.equals("J")?(!var0.equals("Z")?(var0.equals("F")?Float.TYPE:(var0.equals("D")?Double.TYPE:(!var0.equals("C")?Class.forName(var0):Character.TYPE))):Boolean.TYPE):Long.TYPE)):Short.TYPE):Integer.TYPE):Byte.TYPE;
   }

   static final String a(int var0, byte var1, byte[] var2, int var3) {
      ++f;
      if(var1 != -112) {
         a((Object[])((Object[])a[7]), 110);
      }

      char[] var4 = new char[var3];
      int var5 = 0;

      for(int var6 = 0; var3 > var6; ++var6) {
         int var7 = var2[var6 + var0] & 255;
         if(0 != var7) {
            if(var7 >= 128 && 160 > var7) {
               char var8 = mp.f_i[-128 + var7];
               if(var8 == 0) {
                  var8 = 63;
               }

               var7 = var8;
            }

            var4[var5++] = (char)var7;
         }
      }

      return new String(var4, 0, var5);
   }

   static final void a(int var0, Object[] var1) {
      if(var1[1] == null) {
         var1[1] = new int[5];
      }

      ++d;
      int var2 = 40 / ((-35 - var0) / 40);
   }

   static final long a(Object[] var0, int var1) {
      int var2 = 88 / ((-35 - var1) / 44);
      ((long[])((long[])var0[0]))[1] += ng.b(75, var0);
      ++g;
      return ~((long[])((long[])var0[0]))[1] > ~((long[])((long[])var0[0]))[2]?(-((long[])((long[])var0[0]))[1] + ((long[])((long[])var0[0]))[2]) / 1000000L:0L;
   }

}
