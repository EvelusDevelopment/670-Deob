
final class nca {

   static int f = 0;
   static int a;
   static int d;
   static int c;
   static long e = (long)(9.999999999E9D * Math.random());
   static int g;
   static int b;


   static final boolean a(int var0, byte var1, int var2) {
      if(var1 <= 65) {
         return true;
      } else {
         ++d;
         return Class_a.a((byte)-27, var0, var2) || tb.a(96, var0, var2);
      }
   }

   static final void a(Object[] var0, int var1) {
      if(var1 != 18) {
         a(13, (byte)16, -78);
      }

      if(null == var0[1]) {
         var0[1] = new int[6];
      }

      ++b;
      if(null == var0[0]) {
         var0[0] = new boolean[1];
      }

   }

   static final boolean a(boolean var0, Object[] var1, int var2, Object[] var3) {
      if(var2 != 21) {
         e = ((long[])((long[])var1[1]))[10];
      }

      ++g;
      int var4;
      int var5;
      int var6;
      if(var0) {
         if(null != var3 && var3[1] != null) {
            var5 = ((int[])((int[])var3[1]))[1];
            var4 = ((int[])((int[])var3[1]))[0];
            var6 = ((int[])((int[])var3[1]))[2];
         } else {
            var4 = ((int[])((int[])var1[1]))[1];
            var6 = ((int[])((int[])var1[1]))[37];
            var5 = ((int[])((int[])var1[1]))[5];
         }
      } else if(null != var3 && null != var3[4]) {
         var5 = ((int[])((int[])var3[4]))[1];
         var6 = ((int[])((int[])var3[4]))[2];
         var4 = ((int[])((int[])var3[4]))[0];
      } else {
         var6 = ((int[])((int[])var1[1]))[24];
         var4 = ((int[])((int[])var1[1]))[21];
         var5 = ((int[])((int[])var1[1]))[23];
      }

      if(~var4 == 0) {
         return true;
      } else {
         boolean var7 = true;
         if(!Class_ss.a(0, 5, (Object[])((Object[])((Object[])((Object[])var1[7]))[7]), var4)) {
            var7 = false;
         }

         if(-1 != var5 && !Class_ss.a(0, 5, (Object[])((Object[])((Object[])((Object[])var1[7]))[7]), var5)) {
            var7 = false;
         }

         if(var3 != null && var3.length == 36) {
            pn.a((Object[])null, (Object[])null, (Object[])null, 17);
         }

         if(var6 != -1 && !Class_ss.a(0, 5, (Object[])((Object[])((Object[])((Object[])var1[7]))[7]), var6)) {
            var7 = false;
         }

         return var7;
      }
   }

   static final void a(boolean var0, int var1, Object[] var2, int var3, byte var4) {
      ++c;
      if(((int[])((int[])var2[12]))[18] < -1 + ((int[])((int[])var2[33])).length) {
         ++((int[])((int[])var2[12]))[18];
      }

      for(int var5 = ((int[])((int[])var2[12]))[18]; 0 < var5; --var5) {
         ((int[])((int[])var2[33]))[var5] = ((int[])((int[])var2[33]))[-1 + var5];
         ((int[])((int[])var2[14]))[var5] = ((int[])((int[])var2[14]))[var5 - 1];
         ((byte[])((byte[])var2[22]))[var5] = ((byte[])((byte[])var2[22]))[-1 + var5];
      }

      ((int[])((int[])var2[33]))[0] = var3;
      ((int[])((int[])var2[14]))[0] = var1;
      if(var0) {
         if(var2 == null || 27 != var2.length) {
            ((byte[])((byte[])var2[22]))[0] = var4;
         }
      }
   }

}
