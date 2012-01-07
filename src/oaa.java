import jaggl.OpenGL;

final class oaa {

   static int d;
   static int a;
   static int b;
   static int c;


   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, Object[] var6) {
      td.a((byte)-112, var6);
      ++b;
      kd.a(3042, var6, var4);
      if(var3 <= 26) {
         ((int[])((int[])var6[7]))[3] = ((int[])((int[])var6[22]))[18];
      }

      float var7 = (float)var0 + 0.35F;
      float var8 = (float)var1 + 0.35F;
      OpenGL.glColor4ub((byte)(var5 >> 16), (byte)(var5 >> 8), (byte)var5, (byte)(var5 >> 24));
      OpenGL.glBegin(1);
      OpenGL.glVertex2f(var7, var8);
      OpenGL.glVertex2f(var7 + (float)var2, var8);
      OpenGL.glEnd();
   }

   static final int[][] a(int var0, boolean var1, Object[] var2) {
      ++d;
      if(!var1) {
         a(-31, ((boolean[])((boolean[])var2[0]))[0], (Object[])null);
      }

      int[][] var3 = loa.a((byte)-52, var0, (Object[])((Object[])var2[4]));
      if(((boolean[])((boolean[])((Object[])((Object[])var2[4]))[0]))[0]) {
         int[][] var4 = bsa.a(0, (byte)17, var0, var2);
         int[] var5 = var4[0];
         int[] var6 = var4[1];
         int[] var7 = var4[2];
         int[] var8 = var3[0];
         int[] var9 = var3[1];
         int[] var10 = var3[2];

         for(int var11 = 0; var11 < fo.b; ++var11) {
            gpa.a((byte)78, var6[var11], var7[var11], var2, var5[var11]);
            ((int[])((int[])var2[1]))[7] += ((int[])((int[])var2[1]))[2];
            ((int[])((int[])var2[1]))[4] += ((int[])((int[])var2[1]))[3];

            for(((int[])((int[])var2[1]))[1] += ((int[])((int[])var2[1]))[9]; 0 > ((int[])((int[])var2[1]))[1]; ((int[])((int[])var2[1]))[1] += 4096) {
               ;
            }

            while(((int[])((int[])var2[1]))[1] > 4096) {
               ((int[])((int[])var2[1]))[1] -= 4096;
            }

            if(-1 < ~((int[])((int[])var2[1]))[7]) {
               ((int[])((int[])var2[1]))[7] = 0;
            }

            if(4096 < ((int[])((int[])var2[1]))[7]) {
               ((int[])((int[])var2[1]))[7] = 4096;
            }

            if(((int[])((int[])var2[1]))[4] < 0) {
               ((int[])((int[])var2[1]))[4] = 0;
            }

            if(4096 < ((int[])((int[])var2[1]))[4]) {
               ((int[])((int[])var2[1]))[4] = 4096;
            }

            int var12 = ((int[])((int[])var2[1]))[1];
            int var13 = ((int[])((int[])var2[1]))[7];
            int var14 = ((int[])((int[])var2[1]))[4];
            int var15 = 2048 >= var14?var14 * (var13 + 4096) >> 12:-(var14 * var13 >> 12) + var14 + var13;
            if(0 < var15) {
               var12 *= 6;
               int var16 = -var15 + var14 + var14;
               int var17 = (-var16 + var15 << 12) / var15;
               if(var2 != null && 8 == var2.length) {
                  return (int[][])null;
               }

               int var18 = var12 >> 12;
               int var19 = -(var18 << 12) + var12;
               int var20 = var15 * var17 >> 12;
               var20 = var19 * var20 >> 12;
               int var21 = var20 + var16;
               int var22 = -var20 + var15;
               if(5 != var18) {
                  if(4 != var18) {
                     if(var18 == 1) {
                        ((int[])((int[])var2[1]))[6] = var15;
                        ((int[])((int[])var2[1]))[8] = var22;
                        ((int[])((int[])var2[1]))[5] = var16;
                     } else if(var18 == 0) {
                        ((int[])((int[])var2[1]))[6] = var21;
                        ((int[])((int[])var2[1]))[8] = var15;
                        ((int[])((int[])var2[1]))[5] = var16;
                     } else if(2 == var18) {
                        ((int[])((int[])var2[1]))[5] = var21;
                        ((int[])((int[])var2[1]))[8] = var16;
                        ((int[])((int[])var2[1]))[6] = var15;
                     } else if(var18 == 3) {
                        ((int[])((int[])var2[1]))[5] = var15;
                        ((int[])((int[])var2[1]))[6] = var22;
                        ((int[])((int[])var2[1]))[8] = var16;
                     }
                  } else {
                     ((int[])((int[])var2[1]))[8] = var21;
                     ((int[])((int[])var2[1]))[5] = var15;
                     ((int[])((int[])var2[1]))[6] = var16;
                  }
               } else {
                  ((int[])((int[])var2[1]))[5] = var22;
                  ((int[])((int[])var2[1]))[6] = var16;
                  ((int[])((int[])var2[1]))[8] = var15;
               }
            } else {
               ((int[])((int[])var2[1]))[8] = ((int[])((int[])var2[1]))[6] = ((int[])((int[])var2[1]))[5] = var14;
            }

            if(null != var2 && 26 == var2.length) {
               return (int[][])null;
            }

            var8[var11] = ((int[])((int[])var2[1]))[8];
            var9[var11] = ((int[])((int[])var2[1]))[6];
            var10[var11] = ((int[])((int[])var2[1]))[5];
         }
      }

      return var3;
   }

   static final int a(Object[] var0, int var1) {
      ++c;
      return var1 != 12985?-109:cba.a(26951, (Object[])((Object[])var0[17]));
   }

}
