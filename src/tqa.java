import java.io.IOException;

final class tqa {

   static Object[] g = sd.a(new Object[1], 73, (byte)120);
   static int d;
   static int e;
   static int c;
   static byte[][] b;
   static int f = 0;
   static int a;


   static final boolean a(int var0, int var1, int var2) {
      if(var1 >= -38) {
         return false;
      } else {
         ++e;
         return 0 != (256 & var2);
      }
   }

   static final void b(Object[] var0, byte var1) throws IOException {
      ++c;
      ((int[])((int[])var0[1]))[1] = 0;
      if(~((long[])((long[])var0[4]))[0] != ~((long[])((long[])var0[4]))[4]) {
         dm.a(((long[])((long[])var0[4]))[4], 1, (Object[])((Object[])var0[2]));
         ((long[])((long[])var0[4]))[0] = ((long[])((long[])var0[4]))[4];
      }

      int var3;
      for(((long[])((long[])var0[4]))[1] = ((long[])((long[])var0[4]))[4]; ((byte[])((byte[])var0[0])).length > ((int[])((int[])var0[1]))[1]; ((long[])((long[])var0[4]))[0] += (long)var3) {
         int var2 = -((int[])((int[])var0[1]))[1] + ((byte[])((byte[])var0[0])).length;
         if(var2 > 200000000) {
            var2 = 200000000;
         }

         var3 = bpa.a(var2, (byte)34, (Object[])((Object[])var0[2]), (byte[])((byte[])var0[0]), ((int[])((int[])var0[1]))[1]);
         if(-1 == var3) {
            break;
         }

         ((int[])((int[])var0[1]))[1] += var3;
      }

      if(var1 != -5) {
         a((Object[])null, (byte)-38);
      }

      if(var0 != null && (-12 == ~var0.length || -3 == ~var0.length)) {
         mea.a((byte)99, (Object[])null);
      }

   }

   static final void a(Object[] var0, byte var1) {
      if(var1 == 36) {
         ++d;
         ((boolean[])((boolean[])var0[63]))[14] = false;
         if(var0[24] == bga.f) {
            io.a(var0, (int)39);
            gpa.a(var0, (int)103);
         }

      }
   }

   static final int a(Object[] var0, int var1) {
      ++a;
      if(var1 != 1) {
         a((Object[])null, ((int[])((int[])((Object[])((Object[])g[1]))[4]))[12]);
      }

      return ((int[])((int[])var0[1]))[1];
   }

}
