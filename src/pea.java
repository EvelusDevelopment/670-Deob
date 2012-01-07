import jaggl.OpenGL;

final class pea {

   static int g;
   static int c;
   static int e;
   static Object[] a = ed.a(3, new Object[1], (byte)-121, 47);
   static Object[] f = ed.a(8, new Object[1], (byte)-116, 119);
   static Object[] d;
   static Object[] b = sd.a(new Object[1], 77, (byte)126);


   static final Object[] a(int var0) {
      ++c;
      if(null != eka.t && bja.a != null) {
         rda var1;
         rda var2;
         for(Object[] var3 = null != (var1 = (rda)tha.a(bja.a, (byte)123))?var1.o:null; null != var3; var3 = null != (var2 = (rda)tha.a(bja.a, (byte)121))?var2.o:null) {
            Object[] var4 = ita.a(((int[])((int[])var3[1]))[3], eka.e, -73);
            if(null != var4 && ((boolean[])((boolean[])var4[9]))[2] && hta.a(-109, var4, eka.d)) {
               return var3;
            }
         }

         if(var0 != 19) {
            a(-102, (Object[])((Object[])d[2]));
         }

         return null;
      } else {
         return null;
      }
   }

   static final void a(int var0, Object[] var1) {
      if(var0 == 17) {
         ((float[])((float[])var1[25]))[19] = -((float[])((float[])var1[25]))[14] + (float)(-((int[])((int[])var1[1]))[14]) + ((float[])((float[])var1[25]))[5];
         ++e;
         ((float[])((float[])var1[25]))[13] = ((float[])((float[])var1[25]))[19] - ((float[])((float[])var1[25]))[2] * (float)((int[])((int[])var1[1]))[23];
         if(((float[])((float[])var1[25]))[1] > ((float[])((float[])var1[25]))[13]) {
            ((float[])((float[])var1[25]))[13] = ((float[])((float[])var1[25]))[1];
         }

         OpenGL.glFogf(2915, ((float[])((float[])var1[25]))[13]);
         OpenGL.glFogf(2916, ((float[])((float[])var1[25]))[19]);
         oga.q[0] = (float)(16711680 & ((int[])((int[])var1[1]))[34]) / 1.671168E7F;
         oga.q[2] = (float)(((int[])((int[])var1[1]))[34] & 255) / 255.0F;
         oga.q[1] = (float)('\uff00' & ((int[])((int[])var1[1]))[34]) / 65280.0F;
         OpenGL.glFogfv(2918, oga.q, 0);
      }
   }

   static final void a(boolean var0, Object[] var1, boolean var2) {
      ++g;
      ((boolean[])((boolean[])var1[17]))[17] = var0;
      if(var2) {
         b = (Object[])null;
      }

      OpenGL.glDepthMask(((boolean[])((boolean[])var1[17]))[23] && ((boolean[])((boolean[])var1[17]))[17]);
   }

}
