
final class ev {

   static int c;
   static int f;
   static int b;
   static int g;
   static Object[] a = ho.a(-1, 64, new Object[1], true);
   static int d;
   static int e;
   static int h;


   static final void a(int var0, Object[] var1, int var2, int var3) {
      ++e;
      ((int[])((int[])var1[14]))[var3] = var2;
      if(var0 <= 112) {
         a(84, new Object[42], ((int[])((int[])var1[1]))[0], ((int[])((int[])var1[0]))[0]);
      }

   }

   static final boolean a(int var0, Object[] var1) {
      if(var0 != 4120) {
         ((byte[])((byte[])var1[0]))[4] = ((byte[])((byte[])a[4]))[11];
      }

      ++h;
      if(null == var1[3]) {
         Object[] var4 = (Object[])((Object[])var1[2]);
         if(null == var4) {
            throw new IllegalStateException();
         }

         Object[] var3 = lq.b(true, var4);
         var1[3] = var3;
         if(var1[3] == null) {
            return false;
         }

         var1[4] = new Object[((int[])((int[])((Object[])((Object[])var1[3]))[1]))[1]][];
         var1[5] = new Object[((int[])((int[])((Object[])((Object[])var1[3]))[1]))[1]];
      }

      return true;
   }

   static final boolean a(int var0, boolean var1, int var2) {
      ++d;
      boolean var3 = (2048 & var0) != 0;
      if(!var3) {
         return false;
      } else {
         if(!var1) {
            a((Object[])null, 104);
         }

         boolean var4 = bqa.a(var2, (byte)-75, var0) | -1 != ~('\ub000' & var0);
         boolean var5 = 0 != (var0 & 1048832);
         return var4 | var5?true:(var2 & 55) == 0 & (rr.a(var0, var2, 0) | ira.a(var0, -124, var2));
      }
   }

   static final void a(int var0) {
      if(var0 == 1) {
         lga.b(0, qma.c);
         ++b;
      }
   }

   static final String[] a(byte var0, String[] var1) {
      ++g;
      String[] var2 = new String[5];

      for(int var3 = 0; 5 > var3; ++var3) {
         var2[var3] = var3 + " ";
         if(null != var1 && null != var1[var3]) {
            var2[var3] = var2[var3] + var1[var3];
         }
      }

      if(var0 >= -24) {
         a[9] = (Object)null;
      }

      return var2;
   }

   static final void a(Object[] var0, int var1, byte var2) {
      ++f;
      if(-1 != ~(var1 & -128)) {
         if((-16384 & var1) != 0) {
            if(-1 != ~(-2097152 & var1)) {
               if(-1 != ~(var1 & -268435456)) {
                  ek.putByte(var0, var1 >>> 28 | 128);
               }

               ek.putByte(var0, 128 | var1 >>> 21);
            }

            ek.putByte(var0, (2101080 | var1) >>> 14);
         }

         ek.putByte(var0, (16408 | var1) >>> 7);
      }

      ek.putByte(var0, var1 & 127);
      if(var2 > -49) {
         ((int[])((int[])var0[1]))[3] = ((int[])((int[])a[17]))[10];
      }

   }

   static final void a(Object[] var0, int var1) {
      var0[3] = nb.a((byte)57, 256, new Object[5]);
      ++c;
      if(var1 != 2519) {
         a((Object[])((Object[])var0[2]), 34);
      }

      var0[0] = nb.a((byte)68, 256, new Object[5]);
   }

}
