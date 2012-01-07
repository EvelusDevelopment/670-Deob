import jaclib.memory.Buffer;
import jaggl.OpenGL;

final class nja {

   static int c;
   static int f;
   static int a;
   static Object[] g = ed.a(0, new Object[1], (byte)-104, 13);
   static int e;
   static int b;
   static Object[] d = ho.a(3, 11, new Object[1], true);


   static final void a(int var0, Object[] var1) {
      if(var0 != 20390) {
         a(((int[])((int[])var1[4]))[10], -63, -121);
      }

      ++f;
      Object[] var2 = (Object[])((Object[])var1[34]);
      if(((boolean[])((boolean[])var2[0]))[5]) {
         if(var2[5] != null) {
            Object[] var3;
            Object[] var4;
            ((ta)(null != (var3 = (Object[])((Object[])var2[11]))?var3[55]:null)).a(true, (hsa)(null != (var4 = (Object[])((Object[])var2[5]))?var4[3]:null));
            Object[] var5;
            Object[] var6;
            ((ta)((var5 = (Object[])((Object[])var2[11])) != null?var5[55]:null)).a((hsa)(null != (var6 = (Object[])((Object[])var2[9]))?var6[3]:null), var0 ^ 20381);
            Class_ds.a(false, 0, (Object[])((Object[])var2[9]));
            rt.a(0, '\u8ca8', ((int[])((int[])var2[1]))[1], ((int[])((int[])var2[1]))[4], (Object[])((Object[])var2[5]), ((boolean[])((boolean[])var2[0]))[2], 0, 0, true, 0);
         }

         if(var1 != null && 1 == var1.length) {
            vja.a((byte)116, 127, -67, (Object[])null, -38, -25, (Class_s)null, 44, -104, 9, 78);
         }

         sm.a((Object[])((Object[])var2[11]), 117);
         kd.a(3042, (Object[])((Object[])var2[11]), 0);
         za.a(1, -20929, (Object[])((Object[])var2[11]));
         dh.a((Object[])((Object[])var2[11]), (int)92);
         int var11 = 0;
         int var12 = 1;

         ica var7;
         Object[] var14;
         for(Object[] var13 = null != (var7 = (ica)dda.a((Object[])((Object[])var2[3]), 2))?var7.m:null; var13 != null; var13 = var14) {
            ica var8;
            var14 = (var8 = (ica)client.a((Object[])((Object[])var2[3]), -28280)) == null?null:var8.m;
            int var15 = lq.a((byte)-60, var13);

            for(int var16 = 0; var16 < var15; ++var16) {
               Object[] var17 = ((Object[][])((Object[][])var2[2]))[var11];
               Object[] var18 = (Object[])((Object[])var2[10]);
               if(var13 == null) {
                  throw new IllegalStateException();
               }

               pna.a(var13, var17, var16, (byte)-63, var18);
               if(null == var14 && -1 + var15 == var16) {
                  Object[] var9;
                  Object[] var10;
                  ((ta)(null != (var9 = (Object[])((Object[])var2[11]))?var9[55]:null)).a(true, (hsa)((var10 = (Object[])((Object[])var2[9])) != null?var10[3]:null));
                  be.a(0, (Object[])((Object[])var2[11]), 22927, 0);
                  OpenGL.glBegin(7);
                  OpenGL.glTexCoord2f(0.0F, (float)((int[])((int[])var2[1]))[4]);
                  OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 1.0F);
                  OpenGL.glVertex2i(((int[])((int[])var2[1]))[3], ((int[])((int[])var2[1]))[0]);
                  OpenGL.glTexCoord2f(0.0F, 0.0F);
                  OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 0.0F);
                  if(null != var2 && -4 == ~var2.length && var2[1].equals(Integer.valueOf(2))) {
                     pma.a(3, -93, 121, true, (Object[])null, (Buffer)null);
                  }

                  OpenGL.glVertex2i(((int[])((int[])var2[1]))[3], ((int[])((int[])var2[1]))[4] + ((int[])((int[])var2[1]))[0]);
                  OpenGL.glTexCoord2f((float)((int[])((int[])var2[1]))[1], 0.0F);
                  OpenGL.glMultiTexCoord2f('\u84c1', 1.0F, 0.0F);
                  OpenGL.glVertex2i(((int[])((int[])var2[1]))[1] + ((int[])((int[])var2[1]))[3], ((int[])((int[])var2[1]))[0] + ((int[])((int[])var2[1]))[4]);
                  OpenGL.glTexCoord2f((float)((int[])((int[])var2[1]))[1], (float)((int[])((int[])var2[1]))[4]);
                  OpenGL.glMultiTexCoord2f('\u84c1', 1.0F, 1.0F);
                  OpenGL.glVertex2i(((int[])((int[])var2[1]))[3] + ((int[])((int[])var2[1]))[1], ((int[])((int[])var2[1]))[0]);
                  OpenGL.glEnd();
               } else {
                  Class_ds.a(false, var12, (Object[])((Object[])var2[9]));
                  OpenGL.glBegin(7);
                  OpenGL.glTexCoord2f(0.0F, (float)((int[])((int[])var2[1]))[4]);
                  OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 1.0F);
                  if(var1 != null && (1 == var1.length || var1.length == 2)) {
                     vfa.a(-0.26760134F, (byte)108, -0.9221486F, (Object[])null, 0.3729662F, 0.14344788F, -0.54797393F, -0.64536023F);
                  }

                  OpenGL.glVertex2i(0, 0);
                  OpenGL.glTexCoord2f(0.0F, 0.0F);
                  OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 0.0F);
                  OpenGL.glVertex2i(0, ((int[])((int[])var2[1]))[4]);
                  OpenGL.glTexCoord2f((float)((int[])((int[])var2[1]))[1], 0.0F);
                  OpenGL.glMultiTexCoord2f('\u84c1', 1.0F, 0.0F);
                  OpenGL.glVertex2i(((int[])((int[])var2[1]))[1], ((int[])((int[])var2[1]))[4]);
                  OpenGL.glTexCoord2f((float)((int[])((int[])var2[1]))[1], (float)((int[])((int[])var2[1]))[4]);
                  OpenGL.glMultiTexCoord2f('\u84c1', 1.0F, 1.0F);
                  OpenGL.glVertex2i(((int[])((int[])var2[1]))[1], 0);
                  OpenGL.glEnd();
               }

               var11 = 1 & var11 + 1;
               var12 = var12 + 1 & 1;
               bea.b(var13, var16, var0 - 20389);
            }
         }

         ((boolean[])((boolean[])var2[0]))[5] = false;
      }

   }

   static final Object[] a(int var0, int var1, int var2) {
      ++c;
      Object[] var3 = hg.a(var0, (byte)-110);
      if(-1 == var2) {
         return var3;
      } else if(var3 != null && var3[48] != null && ((Object[])((Object[])var3[48])).length > var2) {
         if(var1 != 1) {
            a(-128, (Object[])null);
         }

         return ((Object[][])((Object[][])var3[48]))[var2];
      } else {
         return null;
      }
   }

   static final void a(Object[] var0, int var1) {
      if(var1 == 3) {
         if(null == var0[1]) {
            var0[1] = new int[2];
         }

         if(null == var0[4]) {
            var0[4] = new boolean[1];
         }

         ++b;
      }
   }

   static final void a(byte var0, boolean var1) {
      ++e;
      int var2 = -108 / ((-35 - var0) / 34);
      if(-1 != ~rt.f.length()) {
         qs.a((byte)-105, "--> " + rt.f);
         it.a(var1, (byte)126, false, rt.f);
         tt.d = 0;
         if(!var1) {
            rt.f = "";
            nr.e = 0;
         }

      }
   }

}
