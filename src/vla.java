import jaggl.OpenGL;

final class vla {

   static int a;
   static int[] b = new int[]{1, 2, 4, 8};
   static int d;
   static int[] h;
   static int c;
   static int g = -1;
   static int f;
   static int e;


   static final Object[] a(int var0, Object[] var1, byte var2) {
      ++c;

      int var3;
      for(var3 = 1; var3 < var0; var3 += var3) {
         ;
      }

      var1[0] = nb.a((byte)60, var3, new Object[5]);
      var1[1] = new Object[var3][];
      int var4 = -89 / ((25 - var2) / 43);
      return var1;
   }

   static final void a(Object[] var0, boolean var1, Object[] var2, Object[] var3) {
      if(!var1) {
         a(-75, false, -74, (Object[])((Object[])var0[0]), ((int[])((int[])var0[1]))[1], ((byte[])((byte[])var0[0]))[1]);
      }

      ++e;
      Object[] var4 = ((Object[][])((Object[][])var3[3]))[((int[])((int[])var3[1]))[2]];
      if(var4 != null && -17 == ~var4.length) {
         int var5 = tea.a(!var1, var0);
         if(-1 != var5) {
            float[] var8 = fta.P;
            System.arraycopy(var2[0], 0, var8, 0, 16);
            OpenGL.glUniform4fv(var5, 4, var8, 0);
         }
      } else {
         if(null == var4 || var4.length != 12) {
            throw new IllegalStateException();
         }

         ju.a(var4, var0, var2, (byte)-117);
      }

   }

   static final Object[] a(int var0, boolean var1, int var2, Object[] var3, int var4, byte var5) {
      try {
         ++d;
         if(null != var3 && 5 == var3.length) {
            return null;
         } else if(var4 >= -68) {
            return (Object[])((Object[])var3[1]);
         } else {
            long var9 = (long)var0 + ((long)var2 << 32);
            Object[] var12 = new Object[5];
            ue.a((int)-13707, var12);
            hq.b(var12, -70);
            ((byte[])((byte[])var12[4]))[0] = var5;
            ((boolean[])((boolean[])var12[0]))[1] = var1;
            Object[] var6;
            ((tha)((var6 = var12) != null?var6[1]:null)).m = var9;
            if(!var1) {
               if(cv.a(var3, false) >= 20) {
                  throw new RuntimeException();
               }

               ama.a((tha)(null == var12?null:var12[1]), (byte)-112, (Object[])((Object[])var3[5]));
            } else {
               if(20 <= nd.a(var3, (byte)-127)) {
                  throw new RuntimeException();
               }

               ama.a((tha)(null != var12?var12[1]:null), (byte)-81, (Object[])((Object[])var3[8]));
            }

            return var12;
         }
      } catch (RuntimeException var14) {
         throw vt.a(var14, "vla.C(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ',' + var4 + ',' + var5 + ')');
      }
   }

   static final void a(int var0, Object[] var1) {
      if(var0 != 2) {
         a(16, false, 50, new Object[0], ((int[])((int[])((Object[])((Object[])var1[0]))[1]))[6], (byte)-46);
      }

      ++f;
   }

   static final void a(Object[] var0, int var1) throws Exception {
      if(var1 == 20) {
         ++a;
      }
   }

}
