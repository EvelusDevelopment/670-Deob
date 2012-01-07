import jaggl.OpenGL;

final class iu {

   static String a;
   static int d;
   static int b;
   static int f;
   static int e;
   static int c;


   static final boolean a(int var0, Object[] var1) {
      if(var0 != 1) {
         return ((boolean[])((boolean[])var1[5]))[5];
      } else {
         ++b;
         Object[] var2 = lt.a((Object[])((Object[])var1[5]), 112);
         if(var2 == null) {
            return false;
         } else {
            ina.a(((int[])((int[])var1[1]))[1], var2, -1, (Object[])((Object[])var1[5]), bfa.d, 126);
            return true;
         }
      }
   }

   static final void a(Object[] var0, int var1, Object[] var2, int var3) {
      ++d;
      if(var1 != 1) {
         if(var1 != 2) {
            if(var1 == 4) {
               ((boolean[])((boolean[])var0[2]))[0] = false;
            } else if(5 == var1) {
               var0[0] = ara.b((byte)61, var2);
            }
         } else {
            ((int[])((int[])var0[1]))[0] = lr.a(1, var2);
         }
      } else {
         ((char[])((char[])var0[3]))[0] = kf.a(true, ipa.a(var2, (int)-93));
      }

      if(var3 != 2) {
         a = (String)null;
      }

   }

   static final void a(Object[] var0, int var1, int var2) {
      if(((int[])((int[])var0[var2]))[2] < var1) {
         kea.a(22771, var0);
         if(0 < ((int[])((int[])var0[1]))[3]) {
            OpenGL.glBindBufferARB(((int[])((int[])var0[1]))[0], ((int[])((int[])var0[1]))[3]);
            OpenGL.glBufferDataARBub(((int[])((int[])var0[1]))[0], var1, (byte[])null, 0, !((boolean[])((boolean[])var0[4]))[0]?'\u88e4':'\u88e0');
            ((int[])((int[])((Object[])((Object[])var0[3]))[1]))[32] += -((int[])((int[])var0[1]))[2] + var1;
         } else {
            var0[2] = ho.a(var1, false, 46, (Object[])((Object[])var0[3]));
         }

         ((int[])((int[])var0[1]))[2] = var1;
      }

      ++e;
      ((int[])((int[])var0[1]))[1] = var1;
   }

   static final Object[] a(boolean var0, Object[] var1) {
      ++f;
      if(null == var1[1]) {
         var1[1] = new int[1];
      }

      ((int[])((int[])var1[1]))[0] = -1;
      if(!var0) {
         a((Object[])null, 45, (Object[])((Object[])var1[4]), ((int[])((int[])((Object[])((Object[])var1[2]))[0]))[30]);
      }

      return var1;
   }

}
