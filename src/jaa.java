
final class jaa {

   static int g;
   static long b;
   static int h;
   static int f;
   static boolean d = false;
   static byte[][] f_i;
   static int a;
   static int e;
   Object[] c;


   final void a(int var1) throws Throwable {
      super.finalize();
      if(var1 != 27106) {
         a((Object[])null, 116, (byte)95);
      }

      ++a;
   }

   static final Object[] a(Object[] var0, int var1, boolean var2) {
      ++g;
      if(var2) {
         return (Object[])null;
      } else {
         hi.newByteBufferWrapper(var1);
         return var0;
      }
   }

   static final void a(Object[] var0, int var1, byte var2) {
      ++e;
      if(var2 != 82) {
         d = true;
      }

      if(0 != (((int[])((int[])var0[9]))[var1] & 4)) {
         if(var0 != null && 2 == var0.length) {
            se.a((Object[])null, (Object[])null, 124);
         }

         mt var3;
         mt var4;
         for(Object[] var5 = null == (var3 = (mt)dda.a((Object[])((Object[])((Object[])((Object[])var0[4]))[0]), var2 ^ 80))?null:var3.n; var5 != null; var5 = (var4 = (mt)client.a((Object[])((Object[])((Object[])((Object[])var0[4]))[0]), -28280)) != null?var4.n:null) {
            if(((int[])((int[])var5[1]))[3] == var1) {
               ((int[])((int[])var5[1]))[1] = 0;
            }
         }
      }

   }

   static final long a(int var0, Object[] var1) {
      ++f;
      long var2 = (long)laa.a((byte)66, var1) & 4294967295L;
      if(var0 > -88) {
         ((long[])((long[])var1[4]))[2] = -94L;
      }

      long var4 = (long)laa.a((byte)66, var1) & 4294967295L;
      return var2 + (var4 << 32);
   }

   jaa(Object[] var1) {
      this.c = var1;
   }

   protected final void finalize() throws Throwable {
      hv.a(this.c, true);
      ++h;
   }

}
