
final class bia {

   static int f_i;
   static int f;
   static int d;
   static int h;
   static int c;
   static int a;
   static int e;
   static int[] b = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
   static int g = 0;


   static final void a(int var0, Object[] var1) {
      if(var0 <= -63) {
         ++d;
         ((boolean[])((boolean[])var1[8]))[7] = false;
         if(var1[16] != null) {
            ((ka)var1[16]).G(((ka)var1[16]).va() & -65537);
         }

      }
   }

   static final boolean a(byte var0, Object[] var1) {
      if(var0 < 40) {
         return ((boolean[])((boolean[])var1[7]))[6];
      } else {
         ++f_i;
         return ((boolean[])((boolean[])var1[2]))[0];
      }
   }

   static final void a(byte var0, int var1, int var2, int var3, Object[] var4) {
      ++c;
      if(var0 < 25) {
         f = ((int[])((int[])var4[1]))[6];
      }

      long var13 = (long)(var1 << 14 | var2 << 28 | var3);
      oga var5;
      Object[] var15 = null != (var5 = (oga)pm.a(var13, vg.e, false))?var5.k:null;
      if(null == var15) {
         Object[] var22 = new Object[]{ura.a(-18, new Object[2]), null};
         var22[1] = qga.a(var22, (int)-120);
         di.a(vg.e, true, (lm)(var22 != null?var22[1]:null), var13);
         client.a(122, (Object[])((Object[])var22[0]), (lm)(null != var4?var4[0]:null));
      } else {
         Object[] var16 = us.a(((int[])((int[])var4[1]))[1], (byte)80, cqa.a);
         int var17 = ((int[])((int[])var16[1]))[22];
         if(((int[])((int[])var16[1]))[15] == 1) {
            var17 *= ((int[])((int[])var4[1]))[0] + 1;
         }

         gn var8;
         gn var9;
         for(Object[] var18 = (var8 = (gn)dda.a((Object[])((Object[])var15[0]), 2)) != null?var8.j:null; var18 != null; var18 = (var9 = (gn)client.a((Object[])((Object[])var15[0]), -28280)) != null?var9.j:null) {
            var16 = us.a(((int[])((int[])var18[1]))[1], (byte)59, cqa.a);
            int var19 = ((int[])((int[])var16[1]))[22];
            if(((int[])((int[])var16[1]))[15] == 1) {
               var19 *= 1 + ((int[])((int[])var18[1]))[0];
            }

            if(var17 > var19) {
               lm var20 = (lm)(var4 != null?var4[0]:null);
               lm var21 = (lm)(var18 == null?null:var18[0]);
               if(var20.d != null) {
                  var20.a((byte)23);
               }

               var20.f = var21;
               var20.d = var21.d;
               var20.d.f = var20;
               var20.f.d = var20;
               return;
            }
         }

         client.a(127, (Object[])((Object[])var15[0]), (lm)(var4 == null?null:var4[0]));
      }
   }

   static final float[] a(float[] var0, Object[] var1, int var2) {
      ++a;
      float var3 = ((float[])((float[])var1[0]))[1] + ((float[])((float[])var1[0]))[3];
      float var4 = ((float[])((float[])var1[0]))[7] + ((float[])((float[])var1[0]))[5];
      float var5 = ((float[])((float[])var1[0]))[11] + ((float[])((float[])var1[0]))[9];
      double var6 = Math.sqrt((double)(var5 * var5 + var3 * var3 + var4 * var4));
      var0[2] = (float)((double)var5 / var6);
      if(var2 != 110) {
         return (float[])null;
      } else {
         var0[1] = (float)((double)var4 / var6);
         var0[3] = (float)((double)(((float[])((float[])var1[0]))[15] + ((float[])((float[])var1[0]))[13]) / var6);
         var0[0] = (float)((double)var3 / var6);
         return var0;
      }
   }

   static final oja b(int var0, Object[] var1) {
      if(var0 > -16) {
         b = (int[])null;
      }

      ++e;
      return new oja(var1);
   }

}
