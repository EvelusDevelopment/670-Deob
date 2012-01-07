import jaggl.OpenGL;

final class al extends lm {

   static int k;
   Object[] m;
   static int n;
   static Object[] j = ho.a(-1, 85, new Object[1], true);
   static int f_l;


   al(Object[] var1) {
      this.m = var1;
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, Class_s var7, int var8, int var9, int var10, int var11, Object[] var12, int var13) {
      ++n;
      if(var11 != var6 || var9 != var3) {
         tg var14;
         Object[] var15 = null == (var14 = (tg)var7)?null:var14.f_l;
         Object[] var16 = (Object[])((Object[])var15[0]);
         sm.a(var12, 119);
         moa.a((byte)124, (Object[])((Object[])var15[0]), var12);
         kd.a(3042, var12, var0);
         el.a(8448, var10 + 30849, 7681, var12);
         af.a(768, var12, 30579, '\u8577', 0);
         float var17 = ((float[])((float[])var16[6]))[0] / (float)((int[])((int[])var16[1]))[6];
         float var18 = ((float[])((float[])var16[6]))[1] / (float)((int[])((int[])var16[1]))[5];
         float var19 = (float)var6 - (float)var11;
         float var20 = (float)var9 - (float)var3;
         float var21 = (float)(1.0D / Math.sqrt((double)(var20 * var20 + var19 * var19)));
         var19 *= var21;
         var2 %= var13 + var4;
         var20 *= var21;
         OpenGL.glColor4ub((byte)(var5 >> 16), (byte)(var5 >> 8), (byte)var5, (byte)(var5 >> 24));
         float var22 = var19 * (float)var13;
         float var23 = var20 * (float)var13;
         float var24 = 0.0F;
         float var25 = 0.0F;
         float var26 = var22;
         float var27 = var23;
         if(var13 >= var2) {
            var26 = (float)(-var2 + var13) * var19;
            var27 = var20 * (float)(var13 - var2);
         } else {
            var24 = var19 * (float)(-var2 + var4 + var13);
            var25 = (float)(var13 - (-var4 + var2)) * var20;
         }

         float var28 = var24 + 0.35F + (float)var11;
         float var29 = 0.35F + (float)var3 + var25;
         if(var10 != 13) {
            ((boolean[])((boolean[])var12[0]))[3] = true;
         }

         float var30 = (float)var4 * var19;
         float var31 = var20 * (float)var4;

         while(true) {
            if(var11 < var6) {
               if(var28 > 0.35F + (float)var6) {
                  break;
               }

               if(var26 + var28 > (float)var6) {
                  var26 = -var28 + (float)var6;
               }
            } else {
               if(0.35F + (float)var6 > var28) {
                  break;
               }

               if((float)var6 > var28 + var26) {
                  var26 = (float)var6 - var28;
               }
            }

            if(var9 > var3) {
               if((float)var9 + 0.35F < var29) {
                  break;
               }

               if(var29 + var27 > (float)var9) {
                  var27 = (float)var9 - var29;
               }
            } else {
               if(var29 < (float)var9 + 0.35F) {
                  break;
               }

               if(var29 + var27 < (float)var9) {
                  var27 = -var29 + (float)var9;
               }
            }

            OpenGL.glBegin(1);
            OpenGL.glTexCoord2f(var17 * (var28 - (float)var1), var18 * (var29 - (float)var8));
            OpenGL.glVertex2f(var28, var29);
            OpenGL.glTexCoord2f(((float)(-var1) + var28 + var26) * var17, (var29 + var27 - (float)var8) * var18);
            OpenGL.glVertex2f(var26 + var28, var27 + var29);
            if(null != var15 && 1 == var15.length) {
               dh.a((Object[])null, (int)60);
            }

            var28 += var30 + var26;
            var29 += var27 + var31;
            OpenGL.glEnd();
            var26 = var22;
            var27 = var23;
         }

         if(var12 != null && var12.length == 4 && var12[1].equals(Integer.valueOf(2))) {
            esa.a = -38;
         }

         af.a(768, var12, var10 + 30566, 5890, 0);
      }
   }

   static final void a(byte var0, Object[] var1) {
      if(var0 != -6) {
         a(-39, -25, 40, ((int[])((int[])((Object[])((Object[])var1[7]))[19]))[2], ((int[])((int[])j[11]))[4], 74, 16, (Class_s)null, -19, 73, ((int[])((int[])var1[8]))[1], 127, (Object[])null, -106);
      }

      var1[2] = null;
      ++f_l;
   }

   static final boolean a(int var0, Object[] var1) {
      ++k;
      return var0 != -14419?true:((boolean[])((boolean[])var1[17]))[13] && (!iq.a((byte)-79, var1) || ((boolean[])((boolean[])var1[17]))[19]);
   }

}
