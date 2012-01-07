
final class loa {

   static int g;
   static int d;
   static int c;
   static Object[] a = ho.a(3, 8, new Object[1], true);
   static int e;
   static int f;
   static Object[] b;


   static final void b(byte var0, Object[] var1) {
      ++d;
      int var2 = 49 % ((-29 - var0) / 58);
      if(var1[24] == bsa.b) {
         ((int[])((int[])var1[1]))[30] = ((int[])((int[])var1[1]))[18];
         ((float[])((float[])var1[0]))[6] = ((float[])((float[])var1[0]))[5];
         ((float[])((float[])var1[0]))[1] = ((float[])((float[])var1[0]))[12];
         ((int[])((int[])var1[1]))[21] = ((int[])((int[])var1[1]))[13];
         ((int[])((int[])var1[1]))[25] = ((int[])((int[])var1[1]))[11];
         ((int[])((int[])var1[1]))[20] = ((int[])((int[])var1[1]))[14];
      } else {
         ((int[])((int[])var1[1]))[25] = 0;
         ((int[])((int[])var1[1]))[21] = 0;
         ((int[])((int[])var1[1]))[20] = ((ta)var1[38]).E.e();
         ((int[])((int[])var1[1]))[30] = ((ta)var1[38]).E.d();
         ((float[])((float[])var1[0]))[6] = 0.0F;
         ((float[])((float[])var1[0]))[1] = 1.0F;
      }

      mi.b((byte)-103, var1);
      ((float[])((float[])var1[0]))[9] = (float)((int[])((int[])var1[1]))[14] / 2.0F;
      ((float[])((float[])var1[0]))[10] = (float)((int[])((int[])var1[1]))[18] / 2.0F;
      ((float[])((float[])var1[0]))[15] = (float)((int[])((int[])var1[1]))[13] + ((float[])((float[])var1[0]))[10];
      ((float[])((float[])var1[0]))[4] = ((float[])((float[])var1[0]))[9] + (float)((int[])((int[])var1[1]))[11];
   }

   static final void a(byte var0, Object[] var1) {
      ++e;
      if(var0 >= -46) {
         b = (Object[])null;
      }

      if(((ta)var1[38]).E == null) {
         ((int[])((int[])var1[1]))[1] = 0;
         ((int[])((int[])var1[1]))[26] = 0;
         ((int[])((int[])var1[1]))[2] = 0;
         ((int[])((int[])var1[1]))[16] = 0;
      } else {
         ((int[])((int[])var1[1]))[1] = 0;
         ((int[])((int[])var1[1]))[16] = 0;
         ((int[])((int[])var1[1]))[2] = ((ta)var1[38]).E.e();
         ((int[])((int[])var1[1]))[26] = ((ta)var1[38]).E.d();
      }

      if(((boolean[])((boolean[])var1[63]))[5]) {
         ((boolean[])((boolean[])var1[63]))[5] = false;
         bt.a(var1, true);
      }

   }

   static final void a(int var0, Object[] var1, int var2) {
      if(var0 == 1908) {
         ++g;
         if(null == var1 || 1 != var1.length) {
            mt var3;
            mt var4;
            for(Object[] var6 = (var3 = (mt)dda.a((Object[])((Object[])((Object[])((Object[])var1[4]))[0]), 2)) != null?var3.n:null; null != var6; var6 = null == (var4 = (mt)client.a((Object[])((Object[])((Object[])((Object[])var1[4]))[0]), var0 ^ -26884))?null:var4.n) {
               if(0 > var2 || var2 == ((int[])((int[])var6[1]))[3]) {
                  if(null != var6[0]) {
                     ((on)var6[0]).c(mc.a / 100);
                     if(((on)var6[0]).h()) {
                        ((jua)((Object[])((Object[])var1[4]))[2]).a((kp)var6[0]);
                     }

                     ti.a(0, var6);
                  }

                  if(((int[])((int[])var6[1]))[13] < 0) {
                     ((Object[][][])((Object[][][])var1[25]))[((int[])((int[])var6[1]))[3]][((int[])((int[])var6[1]))[16]] = null;
                  }

                  ((lm)(null != var6?var6[2]:null)).a((byte)48);
               }
            }

         }
      }
   }

   static final int[][] a(byte var0, int var1, Object[] var2) {
      if(var0 != -52) {
         a = (Object[])null;
      }

      ++f;
      if(((int[])((int[])var2[1]))[2] == ((int[])((int[])var2[1]))[0]) {
         ((boolean[])((boolean[])var2[0]))[0] = ((Object[][])((Object[][])var2[4]))[var1] == null;
         ((Object[][])((Object[][])var2[4]))[var1] = vga.b;
         return ((int[][][])((int[][][])var2[3]))[var1];
      } else if(1 == ((int[])((int[])var2[1]))[0]) {
         ((boolean[])((boolean[])var2[0]))[0] = ((int[])((int[])var2[1]))[3] != var1;
         ((int[])((int[])var2[1]))[3] = var1;
         return ((int[][][])((int[][][])var2[3]))[0];
      } else {
         Object[] var6 = ((Object[][])((Object[][])var2[4]))[var1];
         if(var6 != null) {
            ((boolean[])((boolean[])var2[0]))[0] = false;
         } else {
            ((boolean[])((boolean[])var2[0]))[0] = true;
            if(~((int[])((int[])var2[1]))[1] > ~((int[])((int[])var2[1]))[0]) {
               var6 = ql.a(((int[])((int[])var2[1]))[1], new Object[2], (byte)-88, var1);
               ++((int[])((int[])var2[1]))[1];
            } else {
               eq var3;
               Object[] var7 = (var3 = (eq)od.a(2, (Object[])((Object[])var2[2]))) == null?null:var3.j;
               var6 = ql.a(((int[])((int[])var7[1]))[0], new Object[2], (byte)-88, var1);
               ((Object[][])((Object[][])var2[4]))[((int[])((int[])var7[1]))[1]] = null;
               ((lm)(var7 != null?var7[0]:null)).a((byte)18);
            }

            ((Object[][])((Object[][])var2[4]))[var1] = var6;
         }

         dp.a((lm)(null != var6?var6[0]:null), (Object[])((Object[])var2[2]), (byte)88);
         return ((int[][][])((int[][][])var2[3]))[((int[])((int[])var6[1]))[0]];
      }
   }

   static final void a(Object[] var0, byte var1) {
      ++c;
      if(var1 == 5) {
         if(null == var0[1]) {
            var0[1] = new int[5];
         }

      }
   }

   static {
      Object[] var1 = new Object[2];
      b = var1;
   }
}
