import jaggl.OpenGL;

final class dca {

   static Object[] e = null;
   static int f_i = 0;
   static int g = 0;
   static int b;
   static int a;
   static int c;
   static int h;
   static int f;
   static int d;


   static final int a(byte var0, Object[] var1) {
      ++c;
      if(var0 > -124) {
         a((ta)null, -62, (Object[])null);
      }

      return ((int[])((int[])((Object[])((Object[])var1[17]))[1]))[3];
   }

   static final void a(ta var0, int var1, Object[] var2) {
      ++h;
      ya var3 = null;
      if(var1 == 29075) {
         Object[] var4;
         if(var2[14] == null && ((boolean[])((boolean[])var2[8]))[6]) {
            var4 = oja.a(var2, var0, 0, 262144, true);
            var3 = (ya)(null == var4?null:var4[0]);
         } else {
            var3 = (ya)var2[14];
            var2[14] = null;
         }

         var4 = (Object[])((Object[])woa.a(5, var2)[1]);
         if(null != var3) {
            wg.a(var3, ((byte[])((byte[])var2[10]))[1], (int)((float[])((float[])var4[1]))[2], (int)((float[])((float[])var4[1]))[1], (boolean[])null);
         }

      }
   }

   static final void a(Object[] var0, int var1) {
      if(var1 == -27935) {
         ++f;
         if(null == var0[1]) {
            var0[1] = new int[2];
         }

      }
   }

   static final int a(boolean var0, Object[] var1) {
      ++b;
      int var2;
      if(var1 != null && 16 == var1.length && 3 == ((byte[])((byte[])var1[10])).length) {
         var2 = cba.a(26951, (Object[])((Object[])var1[14]));
         return var2;
      } else if(var1 != null && 43 == var1.length) {
         if(((int[])((int[])var1[12]))[7] == -32768) {
            var2 = 0;
         } else {
            var2 = ((int[])((int[])var1[12]))[7];
         }

         return var2;
      } else if(var1 != null && (-12 == ~var1.length || var1.length == 7)) {
         return -31;
      } else if(var1 != null && 20 == var1.length && ((int[])((int[])var1[12])).length == 3 && var1[14].equals(Integer.valueOf(0))) {
         return oaa.a(var1, 12985);
      } else if(var1 != null && -21 == ~var1.length && ((int[])((int[])var1[12])).length == 7) {
         return ta.a(var1, 6);
      } else {
         if(!var0) {
            a((Object[])null, ((int[])((int[])var1[6]))[5]);
         }

         if(null != var1 && 16 == var1.length && -6 == ~((boolean[])((boolean[])var1[8])).length) {
            return gda.a(-126, var1);
         } else if(var1 != null && var1.length == 22) {
            return rja.b(var1, false);
         } else if(null != var1 && var1.length == 18) {
            var2 = var1[16] == null?0:((ka)var1[16]).pa();
            return var2;
         } else if(var1 != null && -24 == ~var1.length) {
            return tja.c(125, var1);
         } else if(null != var1 && var1.length == 17) {
            var2 = null != var1[16]?((ka)var1[16]).pa():0;
            return var2;
         } else if(var1 != null && var1.length == 24) {
            var2 = ((int[])((int[])var1[12]))[14];
            return var2;
         } else if(null != var1 && -21 == ~var1.length && ((boolean[])((boolean[])var1[8])).length == 8) {
            return qd.a(var1, 0);
         } else if(null != var1 && var1.length == 20 && ((boolean[])((boolean[])var1[8])).length == 7) {
            var2 = cba.a(26951, (Object[])((Object[])var1[19]));
            return var2;
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final void c(Object[] var0, int var1) {
      if(((ta)var0[55]).E != null) {
         if(var0 != null && (7 == var0.length && var0[1].equals(Integer.valueOf(1)) || -2 == ~var0.length && var0[0].equals(Boolean.valueOf(false)) && var0[0].equals(Integer.valueOf(2)) || 1 == var0.length)) {
            esa.a = 58;
         }

         int var2;
         int var3;
         int var4;
         int var5;
         if(((int[])((int[])var0[1]))[12] != 2) {
            var4 = ((ta)var0[55]).E.e();
            var3 = 0;
            var2 = 0;
            var5 = ((ta)var0[55]).E.d();
         } else {
            var2 = ((int[])((int[])var0[1]))[4];
            var3 = ((int[])((int[])var0[1]))[39];
            var5 = ((int[])((int[])var0[1]))[0];
            var4 = ((int[])((int[])var0[1]))[1];
         }

         if(var4 < 1) {
            var4 = 1;
         }

         if(var5 < 1) {
            var5 = 1;
         }

         OpenGL.glViewport(var2 + ((int[])((int[])var0[1]))[5], -var3 + ((int[])((int[])var0[1]))[8] + ((ta)var0[55]).E.d() + -var5, var4, var5);
         ((float[])((float[])var0[25]))[9] = (float)((int[])((int[])var0[1]))[0] / 2.0F;
         ((float[])((float[])var0[25]))[0] = (float)((int[])((int[])var0[1]))[1] / 2.0F;
         ((float[])((float[])var0[25]))[4] = ((float[])((float[])var0[25]))[9] + (float)((int[])((int[])var0[1]))[39];
         ((float[])((float[])var0[25]))[3] = ((float[])((float[])var0[25]))[0] + (float)((int[])((int[])var0[1]))[4];
      }

      ++a;
      if(var1 != 20) {
         b((Object[])null, 72);
      }

   }

   static final long b(Object[] var0, int var1) {
      ++d;
      if(null != var0 && 6 == var0.length) {
         return gga.a(var0, -21270);
      } else if(null != var0 && 4 == var0.length) {
         return eca.b(var0, var1 ^ -23948);
      } else {
         if(var1 != 6) {
            a(true, (Object[])null);
         }

         throw new IllegalStateException();
      }
   }

}
