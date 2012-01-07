import java.lang.ref.SoftReference;

final class gb {

   static int c;
   static int f;
   static int e;
   static int b;
   static int a;
   static int d;


   static final void a(Object[] var0, boolean var1) {
      if(var1) {
         Class_h.a(var0, 2);
         ++d;
         us.a((byte)125, (Object[])((Object[])var0[3]));
      }
   }

   static final void b(Object[] var0, int var1) {
      if(null == var0[1]) {
         var0[1] = new int[3];
      }

      ++b;
      if(var1 == 0) {
         ;
      }
   }

   static final int a(byte var0, Object[] var1, int var2) {
      if(var0 >= -106) {
         return -1;
      } else {
         ++a;
         return 1;
      }
   }

   static final Object a(Object[] var0, byte var1) {
      ++f;
      Object var2;
      if(var0 != null && -6 == ~var0.length) {
         var2 = ((SoftReference)var0[4]).get();
         return var2;
      } else if(var1 != 57) {
         return (Object)null;
      } else if(var0 != null && var0.length == 4) {
         var2 = var0[3];
         return var2;
      } else {
         throw new IllegalStateException();
      }
   }

   static final void a(Object[] var0, int var1) {
      if(var0[0] == null) {
         var0[0] = new int[10];
      }

      if(var1 <= -60) {
         ++e;
      }
   }

   static final void a(byte var0, Object[] var1) {
      ++c;
      cc.a(var1, 6);
      int var2 = -71 / ((-53 - var0) / 46);
   }

}
