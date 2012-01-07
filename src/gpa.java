
final class gpa {

   static int f;
   static int e;
   static int h;
   static Object[] f_i = lfa.a("", 9, "", new Object[1], 7, "");
   static int d;
   static int j;
   static boolean a = false;
   static int c;
   static int g;
   static int[] b;


   static final Object[] a(Object[] var0, byte var1) {
      ++c;
      if(null != var0 && var0.length == 9) {
         Object[] var2 = sd.f;
         return var2;
      } else {
         return var1 != -44?(Object[])null:kt.a(var0, 15);
      }
   }

   static final Object[] a(boolean var0, Object[] var1) {
      if(var0) {
         return (Object[])((Object[])((Object[])((Object[])((Object[])((Object[])var1[1]))[9]))[1]);
      } else {
         ++j;
         int var2 = lr.a(1, var1);
         return qga.a(new Object[2], 15846, var2);
      }
   }

   static final void a(Object[] var0, int var1) {
      sea.a((Object[])((Object[])var0[29]), (Object[])((Object[])var0[26]), (byte)102);
      int var2 = -24 % ((var1 - 62) / 34);
      ++e;
      bpa.a((Object[])((Object[])var0[26]), (byte)106, var0);
      ((float[])((float[])var0[0]))[14] = (-((float[])((float[])((Object[])((Object[])var0[26]))[0]))[15] + ((float[])((float[])((Object[])((Object[])var0[26]))[0]))[14]) / (-((float[])((float[])((Object[])((Object[])var0[26]))[0]))[10] + ((float[])((float[])((Object[])((Object[])var0[26]))[0]))[11]);
      ((float[])((float[])var0[0]))[7] = -((float[])((float[])((Object[])((Object[])var0[26]))[0]))[14] / ((float[])((float[])((Object[])((Object[])var0[26]))[0]))[10];
      if(var0[70] != null) {
         Object[] var3 = (Object[])((Object[])var0[70]);
         if(var3 != null) {
            tea.b(false, var3);
         }
      }

      Class_s.a(var0, (byte)127);
   }

   static final void a(int var0, Object[] var1) {
      ++g;
      if(var0 >= -55) {
         a(((byte[])((byte[])var1[2]))[1], -62, -36, (Object[])null, 28);
      }

      throw new IllegalStateException();
   }

   static final Object[] a(Object[] var0, int var1, Object[] var2, Object[] var3) {
      ++h;
      if(null == var2[1]) {
         var2[1] = new int[5];
      }

      if(var1 != -10942) {
         a = ((boolean[])((boolean[])var0[0]))[9];
      }

      var2[3] = var0;
      var2[4] = var3;
      if(var3 != null && (var3.length == 1 || var3.length == 2)) {
         tka.a(87, false, (Object[])null, (Object[])null, var1 ^ 10899, (boolean[][])null, -24, 66);
      }

      Object[] var4;
      Object[] var5;
      ((int[])((int[])var2[1]))[0] = (((aa)(null != (var5 = (Object[])((Object[])var2[3]))?var5[2]:null)).g * ((aa)((var4 = (Object[])((Object[])var2[3])) == null?null:var4[2])).f_i >> ((int[])((int[])((Object[])((Object[])var2[4]))[1]))[5]) + 2;
      Object[] var6;
      Object[] var7;
      ((int[])((int[])var2[1]))[2] = 2 + (((aa)(null == (var6 = (Object[])((Object[])var2[3]))?null:var6[2])).h * ((aa)((var7 = (Object[])((Object[])var2[3])) != null?var7[2]:null)).g >> ((int[])((int[])((Object[])((Object[])var2[4]))[1]))[5]);
      var2[0] = new byte[((int[])((int[])var2[1]))[0] * ((int[])((int[])var2[1]))[2]];
      Object[] var8;
      ((int[])((int[])var2[1]))[4] = -((aa)(null == (var8 = (Object[])((Object[])var2[3]))?null:var8[2])).a + ((int[])((int[])((Object[])((Object[])var2[4]))[1]))[5] + 7;
      Object[] var10;
      ((int[])((int[])var2[1]))[1] = ((aa)((var10 = (Object[])((Object[])var2[3])) == null?null:var10[2])).h >> ((int[])((int[])var2[1]))[4];
      Object[] var9;
      ((int[])((int[])var2[1]))[3] = ((aa)(null != (var9 = (Object[])((Object[])var2[3]))?var9[2]:null)).f_i >> ((int[])((int[])var2[1]))[4];
      return var2;
   }

   static final void a(byte var0, int var1, int var2, Object[] var3, int var4) {
      ++f;
      int var6 = -93 % ((-35 - var0) / 45);
      int var5 = var4 <= var1?var1:var4;
      var5 = var2 > var5?var2:var5;
      int var7 = var4 >= var1?var1:var4;
      var7 = var7 > var2?var2:var7;
      int var8 = -var7 + var5;
      ((int[])((int[])var3[1]))[4] = (var5 + var7) / 2;
      if(0 < var8) {
         int var9 = (-var4 + var5 << 12) / var8;
         int var10 = (var5 + -var1 << 12) / var8;
         int var11 = (-var2 + var5 << 12) / var8;
         if(var5 != var4) {
            if(var5 != var1) {
               ((int[])((int[])var3[1]))[1] = var4 == var7?12288 + var10:20480 + -var9;
            } else {
               ((int[])((int[])var3[1]))[1] = var7 != var2?12288 - var11:4096 + var9;
            }
         } else {
            ((int[])((int[])var3[1]))[1] = var1 == var7?20480 + var11:4096 + -var10;
         }

         ((int[])((int[])var3[1]))[1] /= 6;
      } else {
         ((int[])((int[])var3[1]))[1] = 0;
      }

      if(((int[])((int[])var3[1]))[4] > 0 && 4096 > ((int[])((int[])var3[1]))[4]) {
         ((int[])((int[])var3[1]))[7] = (var8 << 12) / (-2049 > ~((int[])((int[])var3[1]))[4]?-(2 * ((int[])((int[])var3[1]))[4]) + 8192:2 * ((int[])((int[])var3[1]))[4]);
      } else {
         ((int[])((int[])var3[1]))[7] = 0;
      }

   }

   static final void a(int var0, int var1, byte var2, Object[] var3) {
      if(var2 != -30) {
         a = ((boolean[])((boolean[])var3[29]))[3];
      }

      ++d;
      if(((boolean[])((boolean[])var3[2]))[0]) {
         ;
      }

      ((int[])((int[])var3[1]))[5] = (var1 - ((int[])((int[])var3[1]))[1]) * var0 / 255 + ((int[])((int[])var3[1]))[1];
   }

}
