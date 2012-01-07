import java.awt.Canvas;

final class Class_f {

   static int c;
   static int a;
   static int f;
   static int j;
   static int g;
   static int f_i;
   static int e;
   static Object[] h = st.a(new Object[1], 7, 10, 15);
   static int[][] k = new int[][]{{2, 4}, {2, 4}, {5, 2, 4}, {4, 5, 2}, {2, 4, 5}, {5, 2, 4}, {1, 6, 2, 5}, {1, 6, 7, 1}, {6, 7, 1, 1}, {0, 8, 9, 8, 9, 4}, {8, 9, 4, 0, 8, 9}, {2, 10, 0, 10, 11, 11}, {2, 4}, {1, 6, 7, 1}, {1, 6, 7, 1}};
   static int[] d;
   static Object[] b;


   static final boolean a(int var0, Object[] var1) {
      ++f_i;
      return var0 != 0?true:((boolean[])((boolean[])fk.j[0]))[0];
   }

   static final Object[] a(int var0, int var1, Object[] var2, int var3, boolean var4, int var5, int var6, boolean var7, int var8, int var9, int var10, int var11, int var12, int var13) {
      ++f;
      if(null == var2[2]) {
         var2[2] = new short[3];
      }

      if(var2[0] == null) {
         var2[0] = new boolean[1];
      }

      if(var2[1] == null) {
         var2[1] = new int[5];
      }

      ((int[])((int[])var2[1]))[2] = var11;
      ((int[])((int[])var2[1]))[1] = var10;
      if(var2 != null && var2.length == 4 && var2[2].equals(Integer.valueOf(1))) {
         return new Object[9][];
      } else {
         ((short[])((short[])var2[2]))[2] = (short)var0;
         ((short[])((short[])var2[2]))[0] = (short)var9;
         ((int[])((int[])var2[1]))[0] = var13;
         ((boolean[])((boolean[])var2[0]))[0] = var4;
         ((int[])((int[])var2[var1]))[3] = var12;
         ((int[])((int[])var2[1]))[4] = var8;
         ((short[])((short[])var2[2]))[1] = (short)var3;
         return var2;
      }
   }

   static final void a(byte var0, Object[] var1) {
      ++c;
      int var2 = ((ta)var1[55]).E.e();
      int var3 = ((ta)var1[55]).E.d();
      dh.a(9, (float)var2, (float)var3, -1.0F, 1.0F, (Object[])((Object[])var1[2]), 0.0F, 0.0F);
      sea.a(-21614, var1);
      kr.a(var1, (int)114);
      int var4 = -124 % ((var0 - 5) / 51);
      dh.a(var1, (int)115);
   }

   static final ta a(int var0, int var1, qa var2, byte var3, Canvas var4) {
      int var5 = -32 % ((-20 - var3) / 59);
      ++g;
      return new ia(var4, var2, var0, var1);
   }

   static final void a(int var0, byte var1, Object[] var2) {
      if(var1 != 82) {
         a((int)13, (Object[])((Object[])var2[3]));
      }

      ((int[])((int[])var2[1]))[0] = var0;
      ++j;
   }

   static final void a(Object[] var0, int var1) {
      if(se.a((Object[])((Object[])var0[0]), (byte)-122)) {
         ((int[])((int[])var0[1]))[0] = 0;
      }

      ++a;
      if(fpa.a((int)0, (Object[])((Object[])((Object[])((Object[])var0[0]))[24])) == 0) {
         ((int[])((int[])var0[1]))[0] = 0;
      }

      if(((int[])((int[])var0[1]))[0] < 0 || ((int[])((int[])var0[1]))[0] > 2) {
         int[] var2 = (int[])((int[])var0[1]);
         byte var3 = 2;
         var2[0] = var3;
      }

      if(var1 >= -1) {
         a((Object[])null, (Object[])((Object[])((Object[])((Object[])var0[0]))[2]), 4);
      }

   }

   static final Object[] a(Object[] var0, Object[] var1, int var2) {
      if(var2 != 1) {
         return (Object[])((Object[])h[10]);
      } else {
         ++e;
         if(null == var0[1]) {
            var0[1] = new int[2];
         }

         aa.a(15022, var1, var0);
         return var0;
      }
   }

}
